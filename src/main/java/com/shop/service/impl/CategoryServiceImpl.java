package com.shop.service.impl;

import com.shop.dto.CategoryDTO;
import com.shop.entity.Category;
import com.shop.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> getAllCategory(int page, int size) {
        return null;
    }

    @Override
    public Category getCategoryById(long id) {
        return null;
    }

    @Override
    @Transactional
    public Category createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    @Transactional
    public Category updateCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    @Transactional
    public boolean deleteCategoryById(long id) {
        return false;
    }

    @Override
    @Transactional
    public boolean deleteCategories(List<Long> ids) {
        return false;
    }
}
