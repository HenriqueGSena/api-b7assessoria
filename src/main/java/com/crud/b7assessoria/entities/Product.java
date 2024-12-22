package com.crud.b7assessoria.entities;

import jakarta.persistence.*;
import lombok.*;

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

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "cost_value")
    private Double costValue;

    @Column(name = "icms")
    private Double icms;

    @Column(name = "selling_value")
    private Double sellingValue;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column( name = "quantity_stock")
    private Integer quantityStock;
}
