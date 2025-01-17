package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.service.GeneratedFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/field")
public class GeneratedFieldController {

    @Autowired
    private final GeneratedFieldService generatedFieldService;

    public GeneratedFieldController(GeneratedFieldService generatedFieldService) {
        this.generatedFieldService = generatedFieldService;
    }

    @GetMapping("/download")
    public ResponseEntity<byte[]> generateField(
            @RequestParam(defaultValue = "xlsx or csv") String format,
            @RequestParam(required = false) List<String> fields,
            @RequestParam(required = false) Long userId
    ) throws IOException {

        byte[] fileData = generatedFieldService.generateFile(format, fields, userId);
        String fileName = "products." + format;
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);

        String contentType = "csv".equalsIgnoreCase(format)
                ? "text/csv"
                :"application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
        return new ResponseEntity<>(fileData, headers, HttpStatus.OK);
    }
}
