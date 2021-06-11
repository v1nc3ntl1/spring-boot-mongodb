package com.vincent.mongotest4.service;

import com.vincent.mongotest4.model.Product;
import com.vincent.mongotest4.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    @Autowired
    private ProductRepo productRepository;

    public Product getProduct(String title){
        return productRepository.findByTitle(title);
    }

    public void createProduct(String title){
        productRepository.save(new Product(title, title));
    }
}
