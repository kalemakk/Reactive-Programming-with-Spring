package com.example.demo.repositories;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.models.Product;

public interface ProductRepo extends ReactiveCrudRepository<Product, Long>{


    
}
