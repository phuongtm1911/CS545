package edu.mum.formatter;

import edu.mum.domain.Category;
import edu.mum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryFormatter implements Formatter<Category> {
    @Autowired
    CategoryService categoryService;

    @Override
    public Category parse(String s, Locale locale) throws ParseException {
        Category category = null;
        try {
            category = categoryService.getCategoryByName(s);
        } catch (Exception e) {
            System.out.println("Error - Bad Format");
        }
        return category ;
    }

    @Override
    public String print(Category category, Locale locale) {
        return category.getName();
    }
}
