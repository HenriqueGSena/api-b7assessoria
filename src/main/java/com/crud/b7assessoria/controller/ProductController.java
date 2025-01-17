package com.crud.b7assessoria.controller;

import com.crud.b7assessoria.dto.ProductDTO;
import com.crud.b7assessoria.dto.ProductReportDTO;
import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.entities.PageResponse;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.entities.Users;
import com.crud.b7assessoria.repository.CategoryRepository;
import com.crud.b7assessoria.repository.ProductRepository;
import com.crud.b7assessoria.service.CategoryService;
import com.crud.b7assessoria.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.security.Principal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @Autowired
    private final CategoryService categoryService;

    @Autowired
    private final CategoryRepository categoryRepository;

    public ProductController(ProductService productService, CategoryService categoryService, CategoryRepository categoryRepository) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.categoryRepository = categoryRepository;
    }


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
            @RequestParam(defaultValue = "id,asc") String sort,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Boolean active,
            @RequestParam(required = false) String sku,
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) BigDecimal costValue,
            @RequestParam(required = false) BigDecimal icms,
            @RequestParam(required = false) BigDecimal sellingValue,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate registrationDate,
            @RequestParam(required = false) Integer quantityStock,
            @RequestParam(required = false) Long userId
    ) {
        Page<ProductDTO> productPage = productService.listAllProducts(page, size, sort, name, active, sku,
                categoryId, costValue, icms, sellingValue, registrationDate, quantityStock, userId
        );
        String baseUrl = "/product/list?";
        String queryParams = String.format("",
                page, size, sort, name, active, sku, categoryId, costValue, icms, sellingValue, registrationDate, quantityStock, userId);

        String prevPage = productPage.hasPrevious() ? baseUrl + queryParams.replace("page=" + page, "page=" + (page - 1)) : null;
        String nextPage = productPage.hasNext() ? baseUrl + queryParams.replace("page=" + page, "page=" + (page + 1)) : null;
        PageResponse<ProductDTO> response = new PageResponse<>(
                productPage.getContent(),
                productPage.getNumber(),
                productPage.getTotalPages(),
                prevPage,
                nextPage
        );
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{userId}")
    public List<Product> findProductByUserId(@PathVariable Long userId) {
        return productService.findProductsByUserId(userId);
    }

    @GetMapping("/reports")
    public ResponseEntity<PageResponse<ProductReportDTO>> getProductReports(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String sort,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String costValue,
            @RequestParam(required = false) String sellingValue,
            @RequestParam(required = false) Integer quantityStock,
            @RequestParam(required = false) String costTotal,
            @RequestParam(required = false) String sellingTotal,
            @RequestParam(required = false) Long userId
    ) {
        Page<ProductReportDTO> productReportDTOS = productService.getListProductReports(page, size, sort, name, costValue, sellingValue,
                quantityStock, costTotal, sellingTotal, userId
        );
        String prevPage = "/product/list?page=" + (productReportDTOS.hasPrevious() ? page - 1 : page);
        String nextPage = "/product/list?page=" + (productReportDTOS.hasNext() ? page + 1 : page);
        PageResponse<ProductReportDTO> response = new PageResponse<>(
                productReportDTOS.getContent(),
                productReportDTOS.getNumber(),
                productReportDTOS.getTotalPages(),
                prevPage,
                nextPage
        );
        return ResponseEntity.ok(response);
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
