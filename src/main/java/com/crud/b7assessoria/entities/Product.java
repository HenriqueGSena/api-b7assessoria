package com.crud.b7assessoria.entities;

import com.crud.b7assessoria.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private boolean active;

    @Column(name = "sku")
    private String sku;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "cost_value")
    private BigDecimal costValue;

    @Column(name = "icms")
    private BigDecimal icms;

    @Column(name = "selling_value")
    private BigDecimal sellingValue;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column( name = "quantity_stock")
    private Integer quantityStock;

//    public Product(ProductDTO body) {
//        this.id = body.getId();
//        this.name = body.getName();
//        this.active = Boolean.parseBoolean(body.getActive());
//        this.sku = body.getSku();
//        this.categoryId = body.getCategoryId();
//        this.costValue = BigDecimal.valueOf(body.getCostValue());
//        this.icms = BigDecimal.valueOf(body.getIcms());
//        this.sellingValue = BigDecimal.valueOf(body.getSellingValue());
//        this.registrationDate = body.getRegistrationDate();
//        this.quantityStock = body.getQuantityStock();
//    }
}
