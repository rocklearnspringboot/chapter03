package com.springboot.chapter03.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.apache.log4j.Logger;
import java.sql.SQLException;

public class IoCTest {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
//        log.info(user.getUserName());
        System.out.println(user.getUserName() + ": in main");
    }
}
