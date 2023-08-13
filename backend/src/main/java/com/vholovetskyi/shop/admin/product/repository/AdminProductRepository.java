package com.vholovetskyi.shop.admin.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import v.holovetskyi.shop.admin.product.model.AdminProduct;

public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
}
