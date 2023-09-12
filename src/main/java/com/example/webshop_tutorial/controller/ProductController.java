package com.example.webshop_tutorial.controller;

import com.example.webshop_tutorial.model.ProductResponse;
import com.example.webshop_tutorial.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductRepository productRepository = new ProductRepository();
    @GetMapping("/products")
    public List<ProductResponse> getAllProducts(
            @RequestParam(required = false) String tag
    ) {

        return productRepository.findAll(tag);

    }
}
