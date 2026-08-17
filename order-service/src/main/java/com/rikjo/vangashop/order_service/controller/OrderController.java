package com.rikjo.vangashop.order_service.controller;

import com.rikjo.vangashop.order_service.model.Order;
import com.rikjo.vangashop.order_service.producer.OrderProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    //@PostMapping
    @PostMapping("/{orderId}")
    public String createOrder(@PathVariable String orderId, @RequestBody Order order) {

        orderProducer.sendOrder(order);

        return "Order sent to Kafka";
    }
}
