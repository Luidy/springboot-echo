package com.ejjo.echos.controller;

import com.ejjo.echos.domain.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchosController {
    @PostMapping(value = "/api/v1/echos")
    public Body echos(@RequestBody Body body){
        return body;
    }

    @GetMapping(value = "")
    public String hello(){
        return "hello";
    }
}
