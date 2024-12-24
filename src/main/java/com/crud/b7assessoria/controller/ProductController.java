package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.dto.ProductDTO;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.repository.ProductRepository;
import com.crud.b7assessoria.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody ProductDTO productDTO) {
        try {
            Product createProduct = productService.createProduct(productDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(createProduct);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<List<ProductDTO>> list() {
        return ResponseEntity.ok(this.productService.listAllProducts());
    }
}
