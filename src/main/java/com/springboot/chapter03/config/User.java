package com.springboot.chapter03.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user") // will be scan by Spring IoC container: user is the name of bean
// if no user set here ,then will be User to user
public class User {

    @Value("1") // @Value sets the default value
    private Long id;
    @Value("user_name_1")
    private String userName;
    @Value("note_1")
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
