package com.crud.b7assessoria.dto;

import com.crud.b7assessoria.entities.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductDTO {

    private Long id;
    private String name;
    private Boolean active;
    private String sku;
    private Long categoryId;
    private BigDecimal costValue;
    private BigDecimal icms;
    private BigDecimal sellingValue;
    private LocalDate registrationDate;
    private Integer quantityStock;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Boolean active, String sku, Long categoryId, BigDecimal costValue, BigDecimal icms, BigDecimal sellingValue, LocalDate registrationDate, Integer quantityStock) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.sku = sku;
        this.categoryId = categoryId;
        this.costValue = costValue;
        this.icms = icms;
        this.sellingValue = sellingValue;
        this.registrationDate = registrationDate;
        this.quantityStock = quantityStock;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.active = product.isActive();
        this.sku = product.getSku();
        this.categoryId = product.getCategory().getId();
        this.costValue = product.getCostValue();
        this.icms = product.getIcms();
        this.sellingValue = product.getSellingValue();
        this.registrationDate = product.getRegistrationDate();
        this.quantityStock = product.getQuantityStock();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public BigDecimal getCostValue() {
        return costValue;
    }

    public void setCostValue(BigDecimal costValue) {
        this.costValue = costValue;
    }

    public BigDecimal getIcms() {
        return icms;
    }

    public void setIcms(BigDecimal icms) {
        this.icms = icms;
    }

    public BigDecimal getSellingValue() {
        return sellingValue;
    }

    public void setSellingValue(BigDecimal sellingValue) {
        this.sellingValue = sellingValue;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }
}
