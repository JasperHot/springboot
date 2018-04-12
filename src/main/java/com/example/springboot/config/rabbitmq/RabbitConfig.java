package com.example.springboot.config.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Bean
    public Queue HelloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue testQueue() {
        return new Queue("test");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }
}

