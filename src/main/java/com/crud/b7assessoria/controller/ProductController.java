package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.dto.ProductDTO;
import com.crud.b7assessoria.entities.PageResponse;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.repository.ProductRepository;
import com.crud.b7assessoria.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody ProductDTO productDTO, Principal principal) {
        try {
            String username = principal.getName();
            Product createProduct = productService.createProduct(productDTO, username);
            return ResponseEntity.status(HttpStatus.CREATED).body(createProduct);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @GetMapping("/list")
    public ResponseEntity<PageResponse<ProductDTO>> listProduct(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String sort
    ) {
        Page<ProductDTO> productPage = productService.listAllProducts(page, size, sort);
        String prevPage = "/product/list?page=" + (productPage.hasPrevious() ? page - 1 : page);
        String nextPage = "/product/list?page=" + (productPage.hasNext() ? page + 1 : page);
        PageResponse<ProductDTO> response = new PageResponse<>(
                productPage.getContent(),
                productPage.getNumber(),
                productPage.getTotalPages(),
                prevPage,
                nextPage
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user/{userId}")
    public List<Product> findProductByUserId(@PathVariable Long userId) {
        return productService.findProductsByUserId(userId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        ProductDTO productDTO = this.productService.getProductById(id);
        return ResponseEntity.ok(productDTO);
    }

    @PutMapping("/update/{productId}")
    public ResponseEntity updateProduct(@PathVariable Long productId, @RequestBody ProductDTO productDTO) {
        ProductDTO updatedProduct = this.productService.updateProduct(productId, productDTO);
        return ResponseEntity.ok(updatedProduct);
    }

    @PatchMapping("/inactivate/{id}")
    public ResponseEntity inactivateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO) {
        ProductDTO inactivateProduct = this.productService.inactivateProduct(id, productDTO);
        return ResponseEntity.ok(inactivateProduct);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProductId(id);
        return ResponseEntity.noContent().build();

    }
}
