package com.rikjo.vangashop.notification_service.consumer;

import com.rikjo.vangashop.notification_service.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(
            topics = "spring-orders-topic",
            groupId = "notification-group"
    )
    public void consumeOrder(Order order) {

        System.out.println("Notification Service received:");
        System.out.println("Order ID : " + order.getOrderId());
        System.out.println("Status   : " + order.getStatus());
        System.out.println("Amount   : " + order.getAmount());
    }
}
