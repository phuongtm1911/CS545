package edu.mum.exam.controller;

import edu.mum.exam.domain.Product;
import edu.mum.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/addProduct")
    public String addProduct(@ModelAttribute("product") Product product) {
        return "ProductForm";
    }

    @PostMapping("/saveProduct")
    public String saveCategory(@Valid Product product, BindingResult result) {
        if (result.hasErrors()) {
            return "ProductForm";
        }
        productService.saveProduct(product);
        return "redirect:/listProducts";
    }

    @GetMapping("/listProducts")
    public String listProducts(Model model) {
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("products", productList);
        return "ProductList";
    }
}
