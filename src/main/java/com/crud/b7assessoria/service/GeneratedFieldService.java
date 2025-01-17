package com.crud.b7assessoria.service;

import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.repository.ProductRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
public class GeneratedFieldService {

    @Autowired
    private final ProductRepository productRepository;

    public GeneratedFieldService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private static final Map<String, Function<Product, Object>> FIELD_MAPPERS = new HashMap<>();

    static {
        FIELD_MAPPERS.put("Id", Product::getId);
        FIELD_MAPPERS.put("Name", Product::getName);
        FIELD_MAPPERS.put("Active", Product::isActive);
        FIELD_MAPPERS.put("Sku", Product::getSku);
        FIELD_MAPPERS.put("Category_Id", product -> product.getCategory() != null ? product.getCategory().getId() : null);
        FIELD_MAPPERS.put("Cost_Value", product -> product.getCostValue() != null ? product.getCostValue().doubleValue() : null);
        FIELD_MAPPERS.put("Icms", product -> product.getIcms() != null ? product.getIcms().doubleValue() : null);
        FIELD_MAPPERS.put("Selling_Value", product -> product.getSellingValue() != null ? product.getSellingValue().doubleValue() : null);
        FIELD_MAPPERS.put("Registration", product -> product.getRegistrationDate() != null ? product.getRegistrationDate().toString() : null);
        FIELD_MAPPERS.put("Quantity_Stock", Product::getQuantityStock);
        FIELD_MAPPERS.put("User_Id", product -> product.getUser() != null ? product.getUser().getId() : null);
        FIELD_MAPPERS.put("User_Name", product -> product.getUser() != null ? product.getUser().getName() : null);
    }


    public byte[] generateFile(String format, List<String> fields, Long userId) throws IOException {
        List<String> validFields = validateField(fields);
        List<Product> products = productRepository.findByUserId(userId);

        if ("csv".equalsIgnoreCase(format)) {
            return generateFieldCsv(validFields, products);
        } else if ("xlsx".equalsIgnoreCase(format)) {
            return generateFieldXlsx(validFields, products);
        } else {
            throw new IllegalArgumentException("Formato inválido: " + format);
        }
    }

    private byte[] generateFieldXlsx(List<String> fields, List<Product> products) throws IOException {
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            Sheet sheet = workbook.createSheet("Product");

            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < fields.size(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(fields.get(i));
                CellStyle style = workbook.createCellStyle();
                Font font = workbook.createFont();
                font.setBold(true);
                style.setFont(font);
                cell.setCellStyle(style);
            }

            int rowIndex = 1;
            for (Product product : products) {
                Row row = sheet.createRow(rowIndex++);
                for (int i = 0; i < fields.size(); i++) {
                    Object value = FIELD_MAPPERS.get(fields.get(i)).apply(product);
                    if (value != null) {
                        row.createCell(i).setCellValue(value.toString());
                    }
                }
            }

            for (int i = 0; i < fields.size(); i++) {
                sheet.autoSizeColumn(i);
            }

            workbook.write(out);
            return out.toByteArray();
        }
    }

    private byte[] generateFieldCsv(List<String> fields, List<Product> products) throws IOException {
        try (StringWriter writer = new StringWriter()) {
            writer.append(String.join(",", fields)).append("\n");

            // Dados
            for (Product product : products) {
                List<String> values = new ArrayList<>();
                for (String field : fields) {
                    Object value = FIELD_MAPPERS.get(field).apply(product);
                    values.add(value != null ? value.toString() : "");
                }
                writer.append(String.join(",", values)).append("\n");
            }
            return writer.toString().getBytes();
        }
    }

    private List<String> validateField(List<String> fields) {
        return  fields.stream()
                .filter(FIELD_MAPPERS::containsKey)
                .toList();
    }

}
