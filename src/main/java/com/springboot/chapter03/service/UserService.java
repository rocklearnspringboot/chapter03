package com.springboot.chapter03.service;
import com.springboot.chapter03.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void printUser(User user) {
        System.out.println("编号:" + user.getId());
        System.out.println("用户名称:" + user.getUserName());
        System.out.println("备注:" + user.getNote());
    }
}
