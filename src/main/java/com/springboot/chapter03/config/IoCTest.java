package com.springboot.chapter03.config;

import com.springboot.chapter03.pojo.DataBaseProperties;
import com.springboot.chapter03.pojo.User;
import com.springboot.chapter03.pojo.BusinessPerson;
import com.springboot.chapter03.pojo.definition.Person;
import com.springboot.chapter03.scope.pojo.ScopeBean;
import com.springboot.other.pojo.Squirrel;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.apache.log4j.Logger;
import java.sql.SQLException;



public class IoCTest {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);

//        Person person = ctx.getBean(BusinessPerson.class);
//        person.service();
//        log.info(user.getUserName());
//        System.out.println(user.getUserName() + ": in main");

        DataBaseProperties db = ctx.getBean(DataBaseProperties.class);
        db.getDriverName();
//        ScopeBean scopeBean1 = ctx.getBean(ScopeBean.class);
//        ScopeBean scopeBean2 = ctx.getBean(ScopeBean.class);
//        Boolean eq = scopeBean1 == scopeBean2;
//        System.out.println(eq);

        Squirrel squirrel = ctx.getBean(Squirrel.class);
        squirrel.use();

//        ctx.close();
    }
}
