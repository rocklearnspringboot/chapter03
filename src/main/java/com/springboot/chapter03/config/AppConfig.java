package com.springboot.chapter03.config;

import com.springboot.chapter03.condition.DatabaseConditional;
import com.springboot.chapter03.pojo.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration  // 1.represents: this is the java config. Spring container use it to set IoC container and set beans
//@ComponentScan("com.springboot.chapter03.*")
//@ComponentScan(basePackages = {"com.springboot.chapter03.pojo"})
//@ComponentScan(basePackageClasses = {User.class})

@ComponentScan(
        basePackages = "com.springboot.chapter03.*",
        excludeFilters = {@Filter(classes = {Service.class})},
        lazyInit = true)
public class AppConfig {

    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name_1");
        return user;
    }

//	@Bean(name = "dataSource", destroyMethod = "close")
//    @Conditional(DatabaseConditional.class)
//	public DataSource getDataSource(
//            @Value("${database.driverName}") String driver,
//            @Value("${database.url}") String url,
//            @Value("${database.username}") String username,
//            @Value("${database.password}") String password
//    ) {
//
//        Properties props = new Properties();
//        props.setProperty("driver", driver);
//        props.setProperty("url", url);
//        props.setProperty("username", username);
//        props.setProperty("password", password);
//        DataSource dataSource = null;
//        try {
//            dataSource = BasicDataSourceFactory.createDataSource(props);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//	}

    @Bean(name = "dataSource", destroyMethod = "close")
    @Profile("dev")
    public DataSource getDevDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/dev_spring_boot");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean(name = "dataSource", destroyMethod = "close")
    @Profile("test")
    public DataSource getTestDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/test_spring_boot");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

}
