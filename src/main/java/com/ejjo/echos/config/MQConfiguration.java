package com.ejjo.echos.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MQConfiguration {
    private String qName = "echos-queue";
    private String exchangeName = "echos-exchange";

    @Bean
    Queue queue() {
        Queue queue = new Queue(qName, false);
        return queue;
    }

    @Bean
    TopicExchange exchange(){
        return new TopicExchange(exchangeName);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("");
    }
}
