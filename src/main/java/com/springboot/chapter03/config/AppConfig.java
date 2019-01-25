package com.springboot.chapter03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springboot.chapter03.pojo.User;

@Configuration  // 1.represents: this is the java config. Spring container use it to set IoC container and set beans
public class AppConfig {
    @Bean(name = "User")    // 2.represents: initUser function return the POJO user will be set in IoC container
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name_1");
        return user;
    }
}
