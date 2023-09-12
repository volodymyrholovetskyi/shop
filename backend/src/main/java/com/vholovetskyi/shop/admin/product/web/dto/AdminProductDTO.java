package com.vholovetskyi.shop.admin.product.web.dto;

import com.vholovetskyi.shop.admin.product.model.AdminProductCurrency;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;

@Getter
public class AdminProductDTO {

    @NotBlank
    @Length(min = 4)
    private String name;

//    @NotNull
////    private Long categoryId;

    private String category;

    private String currency;

    @NotBlank
    @Length(min = 4)
    private String description;

//    private String fullDescription;

    @NotNull
    @Min(0)
    private BigDecimal price;

//    private AdminProductCurrency currency;

//    private String image;
//
//    @NotBlank
//    @Length(min = 4)
//    private String slug;

}
