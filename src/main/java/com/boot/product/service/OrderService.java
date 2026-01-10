package com.boot.product.service;

import com.boot.product.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderService {
public Order createOrder(Order order);
public Order getOrderById(String id);
public List<Order> getAll();
public Order updateOrderById(String id,Order order);
//public Order cancelOrder(String orderId);
}
