package com.example.springboot.rabbitmq.object;

import com.example.springboot.domain.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver object : " + user);
    }
}
