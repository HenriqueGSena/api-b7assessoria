package com.crud.b7assessoria.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "product")
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

    @Column(name = "category")
    private Category category;

    @Column(name = "CostValue")
    private String CostValue;

    @Column(name = "icms")
    private String icms;

    @Column(name = "SellingValue")
    private String SellingValue;

    @Column(name = "RegistrationDate")
    private String RegistrationDate;

    @Column( name = "QuantityStock")
    private String QuantityStock;
}
