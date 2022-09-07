package com.example.demo.configs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataConfig implements ApplicationRunner{

    private ProductRepo productRepo;


    public void run(ApplicationArguments args) {
        
        // Product a = new Product();
        // a.setProductName("car");

        // Product b = new Product();
        // a.setProductName("beer");
        
        // productRepo.save(new Product(1,"car"));
        // productRepo.save(new Product(2, "beer"));
        
    }
    
}
