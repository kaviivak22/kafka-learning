package com.rikjo.vangashop.order_service.consumer;

import com.rikjo.vangashop.order_service.model.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


//@Service
//Temporarily disabling the consumer to avoid duplicate consumption during testing.
// Uncomment the @Service annotation to enable the consumer in a production environment.
public class OrderConsumer {

    /**
     * Listens to the Kafka topic "orders-topic" and consumes order messages.
     * The groupId is set to "order-group" to allow multiple consumers to share the load.
     *
     * @param order The order message received from Kafka.
     */
    /**
     * Listens to the Kafka topic "spring-orders-topic" and consumes order messages.
     * The groupId is set to "spring-order-consumer-group" to allow multiple consumers to share the load.
     *
     * @param order The order message received from Kafka.
     */
    /*@KafkaListener(
            topics = "spring-orders-topic",
            groupId = "spring-order-consumer-group"
    )*/
    /**
     * Consumes an order message from the Kafka topic.
     *
     * @param order The order message received from Kafka.
     */
    /*public void consumeOrder(Order order) {

        System.out.println("Received Order:");
        System.out.println("ID     : " + order.getOrderId());
        System.out.println("Status : " + order.getStatus());
        System.out.println("Amount : " + order.getAmount());    }

     */
}

