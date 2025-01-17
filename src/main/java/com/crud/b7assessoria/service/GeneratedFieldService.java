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

    private static final Map<String, Function<Product, Object>> FIELD_MAPPERS = Map.of(
            "Id", Product::getId,
            "Name", Product::getName,
            "Active", Product::isActive,
            "Sku", Product::getSku,
            "Category_Id", product -> product.getCategory() != null ? product.getCategory().getId() : null,
            "Cost_Value", product -> product.getCostValue() != null ? product.getCostValue().doubleValue() : null,
            "Icms", product -> product.getIcms() != null ? product.getIcms().doubleValue() : null,
            "Selling_Value", product -> product.getSellingValue() != null ? product.getSellingValue().doubleValue() : null,
            "Registration", product -> product.getRegistrationDate() != null ? product.getRegistrationDate().toString() : null,
            "Quantity_Stock", Product::getQuantityStock
    );

    public byte[] generateFile(String format, List<String> fields) throws IOException {
        List<String> validFields = validateField(fields);

        if ("csv".equalsIgnoreCase(format)) {
            return generateFieldCsv(validFields);
        } else if ("xlsx".equalsIgnoreCase(format)) {
            return generateFieldXlsx(validFields);
        } else {
            throw new IllegalArgumentException("Formato inválido: " + format);
        }
    }

    private byte[] generateFieldXlsx(List<String> fields) throws IOException {
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            Sheet sheet = workbook.createSheet("Product");

            // Cabeçalhos
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

            // Dados
            List<Product> products = productRepository.findAll();
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

    private byte[] generateFieldCsv(List<String> fields) throws IOException {
        List<Product> products = productRepository.findAll();

        try (StringWriter writer = new StringWriter()) {
            // Cabeçalhos
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
