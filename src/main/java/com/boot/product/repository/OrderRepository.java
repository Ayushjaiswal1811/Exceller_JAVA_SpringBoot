package com.boot.product.repository;


import com.boot.product.exception.ProductNotFound;
import com.boot.product.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderRepository {
    private  final ArrayList<Order> list = new ArrayList<>();
    public boolean save(Order order){
        return list.add(order);
    }
    public List<Order> findAll(){
        return list;
    }
    public Order findById(String Id){
        return list.stream().filter(p -> p.getOrderId() == Id).findFirst().orElse(null);
    }
    
    public void deleteById(String id){
        list.removeIf(Order -> Order.getOrderId()==id);
    }
    public Order updateById(String id,Order Order){
        Order existingOrder = findById(id);
        if(existingOrder!=null){
            existingOrder.setOrderId(Order.getOrderId());
            existingOrder.setAmount(Order.getAmount());
            existingOrder.setQuantity(Order.getQuantity());
            existingOrder.setStatus(Order.getStatus());
            existingOrder.setProductId(Order.getProductId());
        }else{
            throw new ProductNotFound("Order not found.");
        }
        return Order;
    }
//    public List<Order> searchByName(String name){
//        return list.stream().filter(p -> p.getName().contains(name)).toList();
//    }
    public List<Order> filter(int min, int max){
        return list.stream().filter(p -> (p.getAmount()>min && p.getAmount()<max)).toList();
    }

}
