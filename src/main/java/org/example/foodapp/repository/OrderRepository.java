package org.example.foodapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    private String order_id;
    private String Customer_name;
    private String product_name;

    public OrderRepository(String customer_name, String product_name, String order_id) {
        Customer_name = customer_name;
        this.product_name = product_name;
        this.order_id = order_id;
    }

    public OrderRepository() {
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void SaveOrder(){
        System.out.println("Order saved in Repository.");
    }
    // TODO:
    // 1. Create method saveOrder()
    // 2. Print "Order saved in repository"
}

