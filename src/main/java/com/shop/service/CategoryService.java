package com.shop.service;

import com.shop.dto.CategoryDTO;
import com.shop.entity.Category;
import com.shop.model.CategoryModel;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryModel> getAllCategory(int page, int size);
    Optional<CategoryModel> getCategoryById(long id);
    Optional<CategoryModel> createCategory(CategoryDTO categoryDTO);
    Category updateCategory(CategoryDTO categoryDTO);
    boolean deleteCategoryById(long id);
    boolean deleteCategories(List<Long> ids);
}
