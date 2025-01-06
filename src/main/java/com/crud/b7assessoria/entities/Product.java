package com.crud.b7assessoria.entities;

import com.crud.b7assessoria.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name="product")
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
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
