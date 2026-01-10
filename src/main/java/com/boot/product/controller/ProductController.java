package com.boot.product.controller;

import com.boot.product.ProductApplication;
import com.boot.product.model.Product;
import com.boot.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService productService){
        this.service=productService;
    }

    @GetMapping
    public List<Product> getAll(){
        return service.getAllProducts();
    }
    @GetMapping("/{id}")
    public List<Product> getById(){
        return service.getAllProducts();
    }
}
