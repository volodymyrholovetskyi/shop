package com.vholovetskyi.shop.admin.category.repository;

import com.vholovetskyi.shop.admin.category.model.AdminCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Long> {
}
