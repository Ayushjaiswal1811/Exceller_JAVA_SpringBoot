package com.boot.product.service;

import com.boot.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts(){
        ArrayList<Product> list = new ArrayList<>();
        Product p1 = new Product(1,"Ayush",35.34);
        Product p2 = new Product(2,"Aman",98.99);
        list.add(p2);
        list.add(p1);
        return list;
    }
}
