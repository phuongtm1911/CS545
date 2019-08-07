package edu.mum.exam.service;

import edu.mum.exam.domain.Product;
import edu.mum.exam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts() { return (List) productRepository.findAll(); }

}
