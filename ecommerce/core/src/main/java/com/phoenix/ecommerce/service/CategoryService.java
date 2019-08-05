package com.phoenix.ecommerce.service;

import com.phoenix.ecommerce.domain.Category;
import com.phoenix.ecommerce.domain.Product;
import com.phoenix.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.getOne(id);
    }

}
