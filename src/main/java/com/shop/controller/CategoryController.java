package com.shop.controller;

import com.shop.dto.CategoryDTO;
import com.shop.response.SuccessResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {
    @GetMapping("/categories")
    public ResponseEntity<?> getAllCategory(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size
    ) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @PostMapping("/category")
    public ResponseEntity<?> createCategory(@Valid @RequestBody CategoryDTO categoryDTO) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @PutMapping("/category")
    public ResponseEntity<?> updateCategory(@Valid @RequestBody CategoryDTO categoryDTO) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<?> deleteCategoryById(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(new SuccessResponse());
    }

    @DeleteMapping("/categories")
    public ResponseEntity<?> deleteCategories(@RequestBody List<Long> categoryIds){
        return ResponseEntity.ok(new SuccessResponse());
    }
}