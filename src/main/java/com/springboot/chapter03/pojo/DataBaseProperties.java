package com.springboot.chapter03.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties("database")
public class DataBaseProperties {

    @Value("#{T(System).currentTimeMillis()}")
    private Long initTime = null;

//    @Value("${database.driverName}")
    private String driverName = null;

//    @Value("${database.url}")
    private String url = null;

    private String username = null;

    private String password = null;

    public void setDriverName(String driverName) {
        System.out.println(driverName);
        this.driverName = driverName;
    }

    public void setUrl(String url) {
        System.out.println(url);
        this.url = url;
    }

//    @Value("${database.username}")
    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

//    @Value("${database.password}")
    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public String getDriverName() {
        System.out.println(this.driverName);
        System.out.println(this.initTime);
        return driverName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
