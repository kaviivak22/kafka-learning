package com.rikjo.vangashop.inventory_service.consumer;

import com.rikjo.vangashop.inventory_service.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryConsumer {
    @KafkaListener(
            topics = "spring-orders-topic",
            groupId = "inventory-group"
    )
    public void consumeOrder(Order order) {

        System.out.println("Inventory Service received:");
        System.out.println("Order ID : " + order.getOrderId());
        System.out.println("Status   : " + order.getStatus());
        System.out.println("Amount   : " + order.getAmount());
    }
}
