package com.phoenix.ecommerce.repository;

import com.phoenix.ecommerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
    @Query("select p from Product p where p.name like ?1")
    List<Product> search(String query);
}
