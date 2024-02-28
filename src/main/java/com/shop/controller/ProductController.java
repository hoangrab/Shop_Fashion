package com.shop.controller;

import com.shop.dto.ProductDTO;
import com.shop.response.SuccessResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @GetMapping("/products")
    public ResponseEntity<?> getAllCategory(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size
    ) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @PostMapping("/product")
    public ResponseEntity<?> createCategory(@Valid @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @PutMapping("/product")
    public ResponseEntity<?> updateCategory(@Valid @RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteCategoryById(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(new SuccessResponse());
    }
}
