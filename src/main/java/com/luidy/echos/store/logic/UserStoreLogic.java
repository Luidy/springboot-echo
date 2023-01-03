package com.luidy.echos.store.logic;

import com.luidy.echos.entity.User;
import com.luidy.echos.store.UserStore;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository /*bean 객체로 등록하기 위한 annotation*/
public class UserStoreLogic implements UserStore {

    private Map<String, User> userMap;

    @Override
    public String create(User user) {
        this.userMap.put(user.getId(), user);
        return user.getId();
    }

    @Override
    public void update(User user) {
        this.userMap.put(user.getId(), user);
    }

    @Override
    public void delete(String id) {
        this.userMap.remove(id);
    }

    @Override
    public User retrieve(String id) {
        return this.userMap.get(id);
    }

    @Override
    public List<User> retrieveAll() {
        return this.userMap.values().stream().collect(Collectors.toList());
    }
}
