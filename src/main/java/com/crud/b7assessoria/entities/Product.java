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
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    @Column(name = "costValue")
    private Double costValue;

    @Column(name = "icms")
    private Double icms;

    @Column(name = "SellingValue")
    private Double sellingValue;

    @Column(name = "RegistrationDate")
    private LocalDate registrationDate;

    @Column( name = "QuantityStock")
    private String quantityStock;
}
