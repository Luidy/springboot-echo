package com.luidy.echos.controller;

import com.luidy.echos.entity.User;
import com.luidy.echos.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public String register(@RequestBody User user) {
        return userService.register(user);
    }

    @GetMapping("/users/{id}")
    public User find(@PathVariable String id) {
        return userService.find(id);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PutMapping("users")
    public void modify(@RequestBody User user) {
        userService.modify(user);
    }

    @DeleteMapping("users/{id}")
    public void remove(@PathVariable String id) {
        userService.remove(id);
    }
}