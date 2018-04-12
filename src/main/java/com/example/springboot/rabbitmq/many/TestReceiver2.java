package com.example.springboot.rabbitmq.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class TestReceiver2 {
    @RabbitHandler
    public void process(String test) {
        System.out.println("Receiver 2: " + test);
    }
}
