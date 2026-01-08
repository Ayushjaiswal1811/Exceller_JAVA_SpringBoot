package org.example.foodapp.service;

import org.example.foodapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestaurentService restaurantService;

    @Autowired
    private DelieveryService deliveryService;
    public void processOrder(){
        orderRepository.SaveOrder();
        restaurantService.prepareFood();
        deliveryService.delieverOrder();
    }

    // TODO:
    // 1. Create method processOrder()
    // 2. Call orderRepository.saveOrder()
    // 3. Call restaurantService.prepareFood()
    // 4. Call deliveryService.deliverOrder()
}

