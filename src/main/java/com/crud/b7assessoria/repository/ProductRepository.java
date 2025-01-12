package com.crud.b7assessoria.repository;

import com.crud.b7assessoria.entities.Category;
import com.crud.b7assessoria.entities.Product;
import com.crud.b7assessoria.entities.Users;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    @Query(value = "SELECT * FROM product WHERE user_id = :userId", nativeQuery = true)
    List<Product> findByUserId(@Param("userId") Long userId);

    default Page<Product> findByFilter(
            String name, Boolean active, String sku, Category category,
            BigDecimal costValue, BigDecimal icms, BigDecimal sellingValue,
            LocalDate registrationDate, Integer quantityStock, Users user, Pageable pageable) {

        return findAll((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (name != null && !name.isEmpty()) {
                predicates.add(criteriaBuilder.like(root.get("name"), "%" + name + "%"));
            }
            if (active != null) {
                predicates.add(criteriaBuilder.equal(root.get("active"), active));
            }
            if (sku != null && !sku.isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("sku"), sku));
            }
            if (category != null) {
                predicates.add(criteriaBuilder.equal(root.get("category"), category));
            }
            if (costValue != null) {
                predicates.add(criteriaBuilder.equal(root.get("costValue"), costValue));
            }
            if (icms != null) {
                predicates.add(criteriaBuilder.equal(root.get("icms"), icms));
            }
            if (sellingValue != null) {
                predicates.add(criteriaBuilder.equal(root.get("sellingValue"), sellingValue));
            }
            if (registrationDate != null) {
                predicates.add(criteriaBuilder.equal(root.get("registrationDate"), registrationDate));
            }
            if (quantityStock != null) {
                predicates.add(criteriaBuilder.equal(root.get("quantityStock"), quantityStock));
            }
            if (user != null) {
                predicates.add(criteriaBuilder.equal(root.get("user"), user));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        }, pageable);
    }

}
