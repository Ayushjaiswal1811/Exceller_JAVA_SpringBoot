package com.boot.product.repository;

import com.boot.product.exception.ProductNotFound;
import com.boot.product.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private  final ArrayList<Product> list = new ArrayList<>();
    public List<Product> findAll(){
        return list;
    }
    public Product findById(int Id){
    return list.stream().filter(p -> p.getId() == Id).findFirst().orElse(null);
    }
    public void save (Product product){
        list.add(product);
    }
    public void deleteById(int id){
        list.removeIf(product -> product.getId()==id);
    }
    public Product updateById(int id,Product product){
        Product existingProduct = findById(id);
        if(existingProduct!=null){
            existingProduct.setId(product.getId());
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
        }else{
            throw new ProductNotFound("Product not found.");
        }
        return product;
    }
    public List<Product> searchByName(String name){
        return list.stream().filter(p -> p.getName().contains(name)).toList();
    }
    public List<Product> filter(int min, int max){
        return list.stream().filter(p -> (p.getPrice()>min && p.getPrice()<max)).toList();
    }
}
