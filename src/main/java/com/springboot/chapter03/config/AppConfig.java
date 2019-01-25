package com.springboot.chapter03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 1.represents: this is the java config. Spring container use it to set IoC container and set beans
@ComponentScan
public class AppConfig {

    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name_1");
        return user;
    }
}
