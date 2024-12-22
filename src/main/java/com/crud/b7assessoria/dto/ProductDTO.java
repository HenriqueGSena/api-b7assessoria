package com.crud.b7assessoria.dto;

import java.time.LocalDate;

public class ProductDTO {

    private Long id;
    private String name;
    private String active;
    private String sku;
    private CategoryDTO categoryDTO;
    private Double costValue;
    private Double icms;
    private Double sellingValue;
    private LocalDate registrationDate;
    private String quantityStock;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String active, String sku, CategoryDTO categoryDTO, Double costValue, Double icms, Double sellingValue, LocalDate registrationDate, String quantityStock) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.sku = sku;
        this.categoryDTO = categoryDTO;
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

    public CategoryDTO getCategoryDTO() {
        return categoryDTO;
    }

    public void setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
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

    public String getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(String quantityStock) {
        this.quantityStock = quantityStock;
    }
}
