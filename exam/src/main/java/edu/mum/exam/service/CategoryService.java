package edu.mum.exam.service;

import edu.mum.exam.domain.Category;
import edu.mum.exam.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);

    public List<Category> getAllCategories();
}
