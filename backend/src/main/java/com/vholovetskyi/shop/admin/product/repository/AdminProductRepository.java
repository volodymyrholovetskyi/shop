package com.vholovetskyi.shop.admin.product.repository;

import com.vholovetskyi.shop.admin.product.model.AdminProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
}
