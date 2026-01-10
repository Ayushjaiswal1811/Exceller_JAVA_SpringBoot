package com.boot.product.controller;

import com.boot.product.ProductApplication;
import com.boot.product.exception.ProductNotFound;
import com.boot.product.model.Product;
import com.boot.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService productService){
        this.service=productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return service.getAllProducts();
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>((service.createProduct(product)),HttpStatus.CREATED);
    }

    @GetMapping("/findById/{id}")
    public Product getById(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        try{
            service.deleteById(id);
            return "Deleted Successfully.";
        } catch (Exception e) {
           return  "Failed to Add";
        }
    }
    @GetMapping("/searchByNameByName/{name}")
    public List<Product> searchByName(@PathVariable String name){
        return service.searchByName(name);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<Product> updateById(@PathVariable int id,@RequestBody Product p){
        try{

            return ResponseEntity.ok(service.updateById(id,p));
        } catch (ProductNotFound e) {
            return  ResponseEntity.notFound().build();
        }
    }
}
