//package com.phoenix.ecommerce.service;
//
//import com.phoenix.ecommerce.domain.Product;
//import com.phoenix.ecommerce.repository.CategoryRepository;
//import com.phoenix.ecommerce.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductService {
//    @Autowired
//    CategoryRepository categoryRepository;
//
//    @Autowired
//    ProductRepository productRepository;
//
//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }
//
//    public Product getProductById(Long id) {
//        return productRepository.getOne(id);
//    }
//
//    public Product getProductByName(String name) {
//        return productRepository.findByName(name);
//    }
//
//    public Product createProduct(Product product) {
//        Product persistedProduct = getProductByName(product.getName());
//        return productRepository.save(product);
//    }
//
//    public Product updateProduct(Product product) {
//        Product persistedProduct = getProductById(product.getId());
//        persistedProduct.setDescription(product.getDescription());
//        persistedProduct.setDisabled(product.isDisabled());
//        persistedProduct.setPrice(product.getPrice());
//        persistedProduct.setCategory(categoryRepository.getOne(product.getCategory().getId()));
//        return productRepository.save(persistedProduct);
//    }
//
//    public List<Product> searchProducts(String query) {
//        return productRepository.search("%"+query+"%");
//    }
//}
