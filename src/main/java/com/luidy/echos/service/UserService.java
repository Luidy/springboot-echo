package com.luidy.echos.service;

import com.luidy.echos.entity.User;

import java.util.List;

public interface UserService {

    String register(User user);
    void modify(User user);
    void remove(String id);

    User find(String id);
    List<User> findAll();
}
