package com.vholovetskyi.shop.product.web;

import com.vholovetskyi.shop.product.model.Product;
import com.vholovetskyi.shop.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

//    @GetMapping("/{slug}")
//    public Product getProductBySlug(
//            @PathVariable
//                    @Pattern(regexp = "[a-z0-9\\-]+")
//                    @Length(max = 255)
//                String slug){
//        return productService.getProductBySlug(slug);
//    }
}
