package com.shop.service.impl;

import com.shop.dto.CategoryDTO;
import com.shop.entity.Category;
import com.shop.model.CategoryModel;
import com.shop.repository.CategoryRepository;
import com.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryModel> getAllCategory(int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        return categoryRepository.findAll(pageable).stream().map(this::convertToModel).collect(Collectors.toList());
    }

    @Override
    public Optional<CategoryModel> getCategoryById(long id) {
        return categoryRepository.findById(id).map(this::convertToModel);
    }

    @Override
    @Transactional
    public Optional<CategoryModel> createCategory(CategoryDTO categoryDTO) {
        Category category = new Category();
        convertToEntity(categoryDTO,category);
        return Optional.ofNullable(convertToModel(categoryRepository.save(category)));
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

    public CategoryModel convertToModel(Category category) {
        return new CategoryModel(category.getId(),category.getName(),category.getCategoryParent().getId());
    }

    public void convertToEntity(CategoryDTO categoryDTO, Category category) {
        if(categoryDTO.getParentId()!=null) {
            Optional<Category> parentCategory = categoryRepository.findById(categoryDTO.getParentId());
            parentCategory.ifPresent(category::setCategoryParent);
        }
        category.setName(categoryDTO.getName());
    }
}
