package com.crud.b7assessoria.dto;

import java.time.LocalDate;

public class ProductDTO {

    private Long id;
    private String name;
    private String active;
    private String sku;
    private Long categoryId;
    private Double costValue;
    private Double icms;
    private Double sellingValue;
    private LocalDate registrationDate;
    private Integer quantityStock;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String active, String sku, Long categoryId, Double costValue, Double icms, Double sellingValue, LocalDate registrationDate, Integer quantityStock) {
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
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

    public Double getCostValue() {
        return costValue;
    }

    public void setCostValue(Double costValue) {
        this.costValue = costValue;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public Double getSellingValue() {
        return sellingValue;
    }

    public void setSellingValue(Double sellingValue) {
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
