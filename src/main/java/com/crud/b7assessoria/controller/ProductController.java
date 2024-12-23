package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.dto.ProductDTO;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

//    @PostMapping("/create")
//    public ResponseEntity createProduct(@RequestBody ProductDTO body) {
//        Product newProduct = new Product(body);
//        this.productRepository.save(newProduct);
//        return ResponseEntity.ok().build();
//    }
}
