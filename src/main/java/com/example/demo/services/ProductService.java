package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepo;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public Flux<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Mono<Product> getProductById(Long productId){
        return productRepo.findById(productId);
    }

    public Mono<Product> saveProduct(String productName){
        Product product  = new Product();
        product.setProductName(productName);
        return productRepo.save(product);
    }
    
}
