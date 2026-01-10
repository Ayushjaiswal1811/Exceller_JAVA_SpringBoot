package com.boot.product.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Order {
    private String orderId;
    private int productId;
    private int quantity;
    private double amount;
    private String status;

    public Order(double amount, int productId, int quantity, String status) {
        this.amount = amount;
        this.orderId= UUID.randomUUID().toString();
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
