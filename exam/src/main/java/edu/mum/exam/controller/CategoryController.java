package edu.mum.exam.controller;

import edu.mum.exam.domain.Category;
import edu.mum.exam.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saveCategory")
    @ResponseBody
    public Category saveCategory(@Valid @RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/categories")
    public String listCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "CategoryList";
    }


}
