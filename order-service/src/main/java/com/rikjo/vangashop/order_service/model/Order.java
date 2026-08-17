package com.rikjo.vangashop.order_service.model;

/**
 * Represents an order in the system.
 */
public class Order {
    private String orderId;
    private String status;
    private double amount;

    public Order() {
    }

    public Order(String orderId, String status, double amount) {
        this.orderId = orderId;
        this.status = status;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }
}
