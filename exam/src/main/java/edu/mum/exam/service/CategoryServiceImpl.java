package edu.mum.exam.service;

import edu.mum.exam.domain.Category;
import edu.mum.exam.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() { return (List<Category>) categoryRepository.findAll(); }
}
