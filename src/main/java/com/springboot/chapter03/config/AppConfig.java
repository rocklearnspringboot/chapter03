package com.springboot.chapter03.config;

import com.springboot.chapter03.pojo.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;


@Configuration  // 1.represents: this is the java config. Spring container use it to set IoC container and set beans
//@ComponentScan("com.springboot.chapter03.*")
//@ComponentScan(basePackages = {"com.springboot.chapter03.pojo"})
//@ComponentScan(basePackageClasses = {User.class})

@ComponentScan(basePackages = "com.springboot.chapter03.*", excludeFilters = {@Filter(classes = {Service.class})})
public class AppConfig {

    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name_1");
        return user;
    }

}
