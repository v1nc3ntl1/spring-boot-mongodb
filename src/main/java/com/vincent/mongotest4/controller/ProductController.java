package com.vincent.mongotest4.controller;

import com.vincent.mongotest4.model.Product;
import com.vincent.mongotest4.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductServices services;

    @GetMapping(value = "/product")
    public ResponseEntity<Product> getProduct(@RequestParam(name = "title") String title) {
        //services.createProduct(title);
        Product product = services.getProduct(title);
        return ResponseEntity.ok(product);
    }
}
