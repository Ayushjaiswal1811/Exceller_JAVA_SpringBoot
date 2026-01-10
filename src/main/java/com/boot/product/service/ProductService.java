package com.boot.product.service;

import com.boot.product.exception.ProductNotFound;
import com.boot.product.model.Product;
import com.boot.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    public ProductService(ProductRepository repository) {
    this.repository=repository;
    }
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
    public Product createProduct(Product product) {
    try{
        repository.save(product);
        return product;
    } catch (Exception e) {
        System.out.println(e);
        throw e;
    }
    }

    public Product findById(int id){
        try {
            return repository.findById(id);
        } catch (Exception e) {
            System.out.println(e);
         return null;
        }
    }
    public boolean deleteById(int id){
        try{
            repository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return  true;
    }

    public Product updateById (int id ,Product product){
        try{
           return repository.updateById(id,product);
        } catch (ProductNotFound e) {
            System.out.println(e);
            throw e;
        }
    }

    public List<Product> searchByName(String name){
        try {
            return repository.searchByName(name);
        } catch (ProductNotFound e) {
            System.out.println(e);
            return null;
        }
    }
    public List<Product> filter(int min,int max){
        return repository.filter(min, max);
    }

//    public List<Product> getAllProducts(){
//        ArrayList<Product> list = new ArrayList<>();
//        Product p1 = new Product(1,"Ayush",35.34);
//        Product p2 = new Product(2,"Aman",98.99);
//        list.add(p2);
//        list.add(p1);
//        return list;
    }

