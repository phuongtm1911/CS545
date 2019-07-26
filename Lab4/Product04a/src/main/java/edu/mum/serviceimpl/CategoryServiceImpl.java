package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Category;
import edu.mum.repository.CategoryRepository;
import edu.mum.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category getCategoryById(int id) {
		return categoryRepository.getCategoryById(id);
	}

	@Override
	public Category getCategoryByName(String name) {
		return categoryRepository.getCategoryByName(name);
	}

	@Override
  	public List<Category> getAll() {
		return categoryRepository.getAll();
	}

}
 
