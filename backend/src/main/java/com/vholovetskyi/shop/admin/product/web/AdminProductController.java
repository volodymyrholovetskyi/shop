package com.vholovetskyi.shop.admin.product.web;

import com.github.slugify.Slugify;
import com.vholovetskyi.shop.admin.product.model.AdminProduct;
import com.vholovetskyi.shop.admin.product.service.AdminProductImageService;
import com.vholovetskyi.shop.admin.product.service.AdminProductService;
import com.vholovetskyi.shop.admin.product.web.dto.AdminProductDTO;
import com.vholovetskyi.shop.admin.product.web.dto.UploadResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
@AllArgsConstructor
public class AdminProductController {

    public static final Long EMPTY_ID = null;
    private final AdminProductService productService;

    private final AdminProductImageService imageService;

    @GetMapping("/admin/products")
    public Page<AdminProduct> getProducts(Pageable pageable) {
        return productService.getProducts(pageable);
    }

    @GetMapping("/admin/products/{id}")
    public AdminProduct getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @PostMapping("/admin/products")
    public AdminProduct createProduct(@RequestBody @Valid AdminProductDTO productDTO) {
        System.out.println("Slug: " + productDTO.getSlug());
        return productService.createProduct(mapAdminProduct(productDTO, EMPTY_ID));
    }

    @PutMapping("/admin/products/{id}")
    public AdminProduct updateProduct(@RequestBody @Valid AdminProductDTO productDTO, @PathVariable Long id) {
        return productService.updateProduct(mapAdminProduct(productDTO, id));
    }

    @DeleteMapping("/admin/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @PostMapping("/admin/products/upload-image")
    public UploadResponse uploadImage(@RequestParam("file") MultipartFile multipartFile) {
        String filename = multipartFile.getOriginalFilename();
        try (InputStream inputStream = multipartFile.getInputStream()) {
            String savedFileName = imageService.uploadImage(filename, inputStream);
            return new UploadResponse(filename);

        } catch (IOException e) {
            throw new RuntimeException("Something went wrong while uploading the file", e);
        }

    }

    @GetMapping("/data/productImage/{filename}")
    public ResponseEntity<Resource> serveFiles(@PathVariable String filename) throws IOException {
        Resource file = imageService.serveFiles(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, Files.probeContentType(Path.of(filename)))
                .body(file);
    }

    private AdminProduct mapAdminProduct(AdminProductDTO productDTO, Long id) {
        return AdminProduct.builder()
                .id(id)
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .fullDescription(productDTO.getFullDescription())
                .categoryId(productDTO.getCategoryId())
                .price(productDTO.getPrice())
//                .currency(productDTO.getCurrency())
                .image(productDTO.getImage())
                .slug(slugifySlug(productDTO.getSlug()))
                .build();
    }

    private String slugifySlug(String slug) {
        Slugify slugify = new Slugify();
        return slugify.withCustomReplacement("_", "-")
                .slugify(slug);
    }
}

