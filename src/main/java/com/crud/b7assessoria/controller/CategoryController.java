package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.dto.CategoryDTO;
import com.crud.b7assessoria.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<List<CategoryDTO>> listCategory() {
        return ResponseEntity.ok(this.categoryService.categorys());
    }
}
