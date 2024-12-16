package com.crud.b7assessoria.entities;

import com.crud.b7assessoria.entities.enums.Type;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "category")
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "type")
    private Type type;
}
