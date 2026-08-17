package com.rikjo.vangashop.order_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    /**
     * Listens to the Kafka topic "orders-topic" and consumes order messages.
     * The groupId is set to "order-group" to allow multiple consumers to share the load.
     *
     * @param order The order message received from Kafka.
     */
    @KafkaListener(
            topics = "spring-orders-topic",
            groupId = "spring-order-consumer-group"
    )
    /**
     * Consumes an order message from the Kafka topic.
     *
     * @param order The order message received from Kafka.
     */
    public void consumeOrder(String order) {

        System.out.println("Received Order: " + order);
    }
}

