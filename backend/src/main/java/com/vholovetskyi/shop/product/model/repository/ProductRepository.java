package com.vholovetskyi.shop.product.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vholovetskyi.shop.product.model.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findBySlug(String slug);
}
