package com.rikjo.vangashop.order_service.producer;

import com.rikjo.vangashop.order_service.model.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    // Kafka topic name
    private static final String TOPIC = "spring-orders-topic";

    private final KafkaTemplate<String, Order> kafkaTemplate;

    /**
     * Constructor for OrderProducer.
     * @param kafkaTemplate
     */
    public OrderProducer(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    /**
     * Sends an order message to the Kafka topic.
     *
     * @param order The order to be sent to Kafka.
     */
    public void sendOrder(Order order) {
        kafkaTemplate.send(TOPIC,order.getOrderId() , order);
    }
}
