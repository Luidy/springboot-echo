package com.luidy.echos.service.logic;

import com.luidy.echos.entity.User;
import com.luidy.echos.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceLogicTest {

    @Autowired // 단위 테스트에서는 UserService 주입이 @Autowired 로만 가능함
    private UserService userService;

    private User user1;
    private User user2;

    @BeforeEach
    public void startUp() {
        this.user1 = new User("user1", "user1@luidy.com");
        this.user2 = new User("user2", "user2@luidy.com");
        this.userService.register(user1);
        this.userService.register(user2);
    }

    @Test
    public void registerTest() {
        User sample = User.sample();

        assertThat(this.userService.register(sample)).isEqualTo(sample.getId());
        assertThat(this.userService.findAll().size()).isEqualTo(3);
    }

    @Test
    public void findTest() {
        assertThat(this.userService.find(user1.getId())).isNotNull();
        assertThat(this.userService.find(user1.getId()).getEmail()).isEqualTo(user1.getEmail());
    }

    @AfterEach
    public void cleanUp() {
        this.userService.remove(this.user1.getId());
        this.userService.remove(this.user2.getId());
    }
}
