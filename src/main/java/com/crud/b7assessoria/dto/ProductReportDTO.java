package com.crud.b7assessoria.dto;

import java.math.BigDecimal;

public class ProductReportDTO {

    private Long id;
    private String name;
    private String costValue;
    private String sellingValue;
    private Integer quantityStock;
    private String costTotal;
    private String sellingTotal;

    public ProductReportDTO() {
    }

    public ProductReportDTO(Long id, String name, String costValue, String sellingValue, Integer quantityStock, String costTotal, String sellingTotal) {
        this.id = id;
        this.name = name;
        this.costValue = costValue;
        this.sellingValue = sellingValue;
        this.quantityStock = quantityStock;
        this.costTotal = costTotal;
        this.sellingTotal = sellingTotal;
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

    public String getCostValue() {
        return costValue;
    }

    public void setCostValue(String costValue) {
        this.costValue = costValue;
    }

    public String getSellingValue() {
        return sellingValue;
    }

    public void setSellingValue(String sellingValue) {
        this.sellingValue = sellingValue;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public String getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(String costTotal) {
        this.costTotal = costTotal;
    }

    public String getSellingTotal() {
        return sellingTotal;
    }

    public void setSellingTotal(String sellingTotal) {
        this.sellingTotal = sellingTotal;
    }
}
