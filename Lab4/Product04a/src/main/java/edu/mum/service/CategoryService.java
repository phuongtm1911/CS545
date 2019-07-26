package edu.mum.service;

import java.util.List;

import edu.mum.domain.Category;
import edu.mum.domain.Product;

 public interface CategoryService  {	
 	public Category getCategoryById(int id);
 	public Category getCategoryByName(String name);
 	public List<Category> getAll();
}
 
