package com.crud.b7assessoria.dto;

public class ProductDTO {

    private Long id;
    private String name;
    private String active;
    private String sku;
    private CategoryDTO categoryDTO;
    private String CostValue;
    private String icms;
    private String SellingValue;
    private String RegistrationDate;
    private String QuantityStock;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String active, String sku, CategoryDTO categoryDTO, String costValue, String icms, String sellingValue, String registrationDate, String quantityStock) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.sku = sku;
        this.categoryDTO = categoryDTO;
        CostValue = costValue;
        this.icms = icms;
        SellingValue = sellingValue;
        RegistrationDate = registrationDate;
        QuantityStock = quantityStock;
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

    public String getCostValue() {
        return CostValue;
    }

    public void setCostValue(String costValue) {
        CostValue = costValue;
    }

    public String getIcms() {
        return icms;
    }

    public void setIcms(String icms) {
        this.icms = icms;
    }

    public String getSellingValue() {
        return SellingValue;
    }

    public void setSellingValue(String sellingValue) {
        SellingValue = sellingValue;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
    }

    public String getQuantityStock() {
        return QuantityStock;
    }

    public void setQuantityStock(String quantityStock) {
        QuantityStock = quantityStock;
    }
}
