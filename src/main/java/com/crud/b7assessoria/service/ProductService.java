package com.crud.b7assessoria.service;

import com.crud.b7assessoria.dto.ProductDTO;
import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.exceptions.ProductNotFoundException;
import com.crud.b7assessoria.repository.CategoryRepository;
import com.crud.b7assessoria.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public Product createProduct(ProductDTO productDTO) {
        Category category = categoryRepository.findById(productDTO.getCategoryId())
                .orElseThrow(() -> new ProductNotFoundException("Categoria não encontrada"));

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

    public Page<ProductDTO> listAllProducts(int page) {
        int size = 10;
        Pageable pageable = PageRequest.of(page, size, Sort.by("id").ascending());
        Page<Product> productPage = productRepository.findAll(pageable);
        return productPage.map(ProductDTO::new);
    }

    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Produto não encontrado do ID: " + id));
        return new ProductDTO(product);
    }

    public ProductDTO updateProduct(Long productId, ProductDTO productDTO) {
        Optional<Product> product = productRepository.findById(productId);
        if (product.isPresent()) {
            Optional<Category> categoryOptional = categoryRepository.findById(productDTO.getCategoryId());
            if (categoryOptional.isEmpty()) {
                throw new ProductNotFoundException("Categoria não encontrada do ID: " + productDTO.getCategoryId());
            }
            Product updatingProduct = product.get();
            updatingProduct.setName(productDTO.getName());
            updatingProduct.setActive(productDTO.getActive());
            updatingProduct.setSku(productDTO.getSku());
            updatingProduct.setCategory(categoryOptional.get());
            updatingProduct.setCostValue(productDTO.getCostValue());
            updatingProduct.setIcms(productDTO.getIcms());
            updatingProduct.setSellingValue(productDTO.getSellingValue());
            updatingProduct.setRegistrationDate(productDTO.getRegistrationDate());
            updatingProduct.setQuantityStock(productDTO.getQuantityStock());
            return new ProductDTO(productRepository.save(updatingProduct));
        } else {
            throw new ProductNotFoundException("Produto não encontrado do ID: " + productId);
        }
    }

    public ProductDTO inactivateProduct(Long productId, ProductDTO productDTO) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException("Produto ja esta inativo: " + productId));
        product.setActive(false);
        Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct);
    }


    public void deleteProductId(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Produto não encontrado com ID: " + id));
        productRepository.delete(product);
    }

}
