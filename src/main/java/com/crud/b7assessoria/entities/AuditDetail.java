package com.crud.b7assessoria.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "auditDetails")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class AuditDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "field")
    private String field;

    @Column(name = "oldValue")
    private String oldValue;

    @Column(name = "newValue")
    private String newValue;

    @ManyToOne
    @JoinColumn(name = "audit_id")
    private Audit audit;
}
