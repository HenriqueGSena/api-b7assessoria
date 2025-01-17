package com.crud.b7assessoria.repository;

import com.crud.b7assessoria.dto.ProductReportDTO;
import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.entities.Users;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface ProductReportRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    default Page<Product> findByFilterReport(
            String name, String costValue, String sellingValue, Integer quantityStock, String costTotal, String sellingTotal, Users user, Pageable pageable) {

        return findAll((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (name != null && !name.isEmpty()) {
                predicates.add(criteriaBuilder.like(root.get("name"), "%" + name + "%"));
            }
            if (costValue != null) {
                predicates.add(criteriaBuilder.equal(root.get("costValue"), costValue));
            }
            if (sellingValue != null) {
                predicates.add(criteriaBuilder.equal(root.get("sellingValue"), sellingValue));
            }
            if (quantityStock != null) {
                predicates.add(criteriaBuilder.equal(root.get("quantityStock"), quantityStock));
            }
            if (costTotal != null) {
                predicates.add(criteriaBuilder.equal(root.get("costTotal"), costTotal));
            }
            if (sellingTotal != null) {
                predicates.add(criteriaBuilder.equal(root.get("sellingTotal"), sellingTotal));
            }
            if (user != null) {
                predicates.add(criteriaBuilder.equal(root.get("user"), user));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        }, pageable);
    }
}
