package com.vholovetskyi.shop.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import v.holovetskyi.shop.admin.category.model.AdminCategory;

public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Long> {
}
