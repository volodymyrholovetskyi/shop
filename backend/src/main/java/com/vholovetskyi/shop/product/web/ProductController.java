package com.vholovetskyi.shop.product.web;

import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v.holovetskyi.shop.product.model.Product;
import v.holovetskyi.shop.product.service.ProductService;

import javax.validation.constraints.Pattern;

@RestController
@AllArgsConstructor
@Validated
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping()
    Page<Product> getProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @GetMapping("/{slug}")
    public Product getProductBySlug(
            @PathVariable
                    @Pattern(regexp = "[a-z0-9\\-]+")
                    @Length(max = 255)
                String slug){
        return productService.getProductBySlug(slug);
    }
}
