package com.luidy.echos.service.logic;

import com.luidy.echos.entity.User;
import com.luidy.echos.service.UserService;
import com.luidy.echos.store.UserStore;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bean 객체로 등록함

// 3. @RequiredArgsConstructor 사용 시 final로 초기화 필요함
@RequiredArgsConstructor
public class UserServiceLogic implements UserService {

    private final UserStore userStore;

    /*
    @Autowired
    // 1. UserStore는 이미 등록된 bean 객체이고 @Autowired 를 통해 주입됨
    private UserStore userStore;
    */

    /*
    // 2. @Autowired 와 동일한 기능
    public UserServiceLogic(UserStore userStore) {
        this.userStore = userStore;
    }
    */

    @Override
    public String register(User user) {
        return this.userStore.create(user);
    }

    @Override
    public void modify(User user) {
        this.userStore.update(user);
    }

    @Override
    public void remove(String id) {
        this.userStore.delete(id);
    }

    @Override
    public User find(String id) {
        return this.userStore.retrieve(id);
    }

    @Override
    public List<User> findAll() {
        return this.userStore.retrieveAll();
    }
}
