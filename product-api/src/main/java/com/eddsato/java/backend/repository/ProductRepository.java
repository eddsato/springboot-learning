package com.eddsato.java.backend.repository;

import com.eddsato.java.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p " +
            "FROM product p " +
            "JOIN category c ON p.category.id = c.id " +
            "WHERE c.id = :categoryId")
    public List<Product> getProductByCategory(@Param("categoryId") long categoryId);

    public Product findByProductIdentifier(String productIdentifier);
}
