package com.luidy.echos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchosController {

    @GetMapping("/echos")
    public String echos() {
        return "echos";
    }
}