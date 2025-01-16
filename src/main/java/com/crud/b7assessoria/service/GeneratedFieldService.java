package com.crud.b7assessoria.service;

import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.repository.ProductRepository;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class GeneratedFieldService {

    private final ProductRepository productRepository;

    public GeneratedFieldService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public byte[] generateField() throws IOException {
        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            Sheet sheet = workbook.createSheet("Product");

            Row headerRow = sheet.createRow(0);
            String[] columns = {"Id", "Name", "Active", "Sku", "Category_Id", "Cost_Value", "Icms", "Selling_Value", "Registration", "Quantity_Stock"};
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                CellStyle style = workbook.createCellStyle();
                Font font = workbook.createFont();
                font.setBold(true);
                style.setFont(font);
                cell.setCellStyle(style);
            }
            List<Product> products = productRepository.findAll();
            int rowIndex = 1;
            for (Product product : products) {
                Row row = sheet.createRow(rowIndex++);
                row.createCell(0).setCellValue(product.getId());
                row.createCell(1).setCellValue(product.getName());
                row.createCell(2).setCellValue(product.isActive());
                row.createCell(3).setCellValue(product.getSku());
                row.createCell(4).setCellValue(product.getCategory().getId());
                row.createCell(5).setCellValue(product.getCostValue().doubleValue());
                row.createCell(6).setCellValue(product.getIcms().doubleValue());
                row.createCell(7).setCellValue(product.getSellingValue().doubleValue());
                row.createCell(8).setCellValue(product.getRegistrationDate().toString());
                row.createCell(9).setCellValue(product.getQuantityStock());
            }

            for (int i = 0; i < columns.length; i++) {
                sheet.autoSizeColumn(i);
            }

            workbook.write(out);
            return out.toByteArray();
        }
    }
}
