package com.example.springboot.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver {
    @RabbitHandler
    public void process(String message) {
        System.out.println("Topic Receiver1  : " + message);
    }
}
