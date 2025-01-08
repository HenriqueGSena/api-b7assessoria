package com.crud.b7assessoria.repository;

import com.crud.b7assessoria.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findAll(Pageable pageable);

    @Query(value = "SELECT * FROM product WHERE user_id = :userId", nativeQuery = true)
    List<Product> findByUserId(@Param("userId") Long userId);
}
