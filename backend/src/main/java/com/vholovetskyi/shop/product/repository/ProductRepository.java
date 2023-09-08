package com.vholovetskyi.shop.product.repository;

import com.vholovetskyi.shop.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
