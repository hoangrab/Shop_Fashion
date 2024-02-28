package com.shop.service;

import com.shop.dto.CategoryDTO;
import com.shop.entity.Category;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory(int page, int size);
    Category getCategoryById(long id);
    Category createCategory(CategoryDTO categoryDTO);
    Category updateCategory(CategoryDTO categoryDTO);
    boolean deleteCategoryById(long id);
    boolean deleteCategories(List<Long> ids);
}
