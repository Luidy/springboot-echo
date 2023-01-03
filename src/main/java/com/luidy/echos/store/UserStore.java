package com.luidy.echos.store;

import com.luidy.echos.entity.User;

import java.util.List;

public interface UserStore {
    String create(User user);
    void update(User user);
    void delete(String id);

    User retrieve(String id);
    List<User> retrieveAll();
}
