package edu.mum.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.domain.Category;
import edu.mum.repository.CategoryRepository;

@Repository
 public class CategoryRepositoryImpl implements CategoryRepository {
	
    private List<Category> categories;

    public CategoryRepositoryImpl() {
        categories = new ArrayList<Category>();
        Category computerCategory = new Category(1, "Computer");
        Category sportsCategory = new Category(2, "Sports");
        Category foodCategory = new Category(3, "Food");
        categories.add(computerCategory);
        categories.add(sportsCategory);
        categories.add(foodCategory);
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }
    
    @Override
    public Category getCategoryById(int id) {
        for (Category category : categories) {
            if (id == category.getId()) {
                return category;
            }
        }
        return null;
    }

    @Override
    public Category getCategoryByName(String name) {
        for (Category category : categories) {
            if (name == category.getName()) {
                return category;
            }
        }
        return null;
    }

		   
}
 
