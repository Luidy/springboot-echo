package com.ejjo.echos.controller;

import com.ejjo.echos.domain.Body;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.binder.rabbit.admin.RabbitManagementUtils;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchosController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping(value = "/api/v1/echos")
    public Body echos(@RequestBody Body body){
        rabbitTemplate.convertAndSend("echos-exchange", "echos", body.getContent());
        return body;
    }

    @GetMapping(value = "")
    public String hello(){
        return "hello";
    }

    private static final <T> Message<T> message(T val) {
        return MessageBuilder.withPayload(val).build();
    }
}
