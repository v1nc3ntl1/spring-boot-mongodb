package com.vincent.mongotest4.repository;

import com.vincent.mongotest4.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {

	public Product findByTitle(String title);
}
