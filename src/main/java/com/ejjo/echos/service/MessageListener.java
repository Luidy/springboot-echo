package com.ejjo.echos.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    public void receiveMessage(String m){
        System.out.println("Message from Queue: "+m);
    }
}
