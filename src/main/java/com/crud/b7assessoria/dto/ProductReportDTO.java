package com.crud.b7assessoria.dto;

import java.math.BigDecimal;

public class ProductReportDTO {

    private Long id;
    private String name;
    private BigDecimal costValue;
    private BigDecimal sellingValue;
    private Integer quantityStock;
    private BigDecimal costTotal;
    private BigDecimal sellingTotal;

    public ProductReportDTO() {
    }

    public ProductReportDTO(Long id, String name, BigDecimal costValue, BigDecimal sellingValue, Integer quantityStock, BigDecimal costTotal, BigDecimal sellingTotal) {
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

    public BigDecimal getCostValue() {
        return costValue;
    }

    public void setCostValue(BigDecimal costValue) {
        this.costValue = costValue;
    }

    public BigDecimal getSellingValue() {
        return sellingValue;
    }

    public void setSellingValue(BigDecimal sellingValue) {
        this.sellingValue = sellingValue;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }

    public BigDecimal getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(BigDecimal costTotal) {
        this.costTotal = costTotal;
    }

    public BigDecimal getSellingTotal() {
        return sellingTotal;
    }

    public void setSellingTotal(BigDecimal sellingTotal) {
        this.sellingTotal = sellingTotal;
    }
}
