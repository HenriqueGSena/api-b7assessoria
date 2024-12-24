package com.crud.b7assessoria.service;

import com.crud.b7assessoria.dto.ProductDTO;
import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.repository.CategoryRepository;
import com.crud.b7assessoria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Product createProduct(ProductDTO productDTO) {
        Category category = categoryRepository.findById(productDTO.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        Product product = new Product();
        product.setName(productDTO.getName());
        product.setActive(productDTO.getActive());
        product.setSku(productDTO.getSku());
        product.setCategory(category);
        product.setCostValue(productDTO.getCostValue());
        product.setIcms(productDTO.getIcms());
        product.setSellingValue(productDTO.getSellingValue());
        product.setRegistrationDate(productDTO.getRegistrationDate());
        product.setQuantityStock(productDTO.getQuantityStock());
        return productRepository.save(product);
    }
}
