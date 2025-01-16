package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.service.GeneratedFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/field")
public class GeneratedFieldController {

    @Autowired
    private final GeneratedFieldService generatedFieldService;

    public GeneratedFieldController(GeneratedFieldService generatedFieldService) {
        this.generatedFieldService = generatedFieldService;
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> generateField() throws IOException {
        try {
            byte[] fileContent = generatedFieldService.generateField();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.setContentDispositionFormData("attachment", "products.xlsx");
            return ResponseEntity.ok()
                    .headers(headers)
                    .body(fileContent);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
