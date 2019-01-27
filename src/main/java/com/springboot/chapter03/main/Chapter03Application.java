package com.springboot.chapter03.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.springboot.chapter03"}) // SpringBootApplication already have
@PropertySource(value={"classpath:jdbc.properties"}, ignoreResourceNotFound=true) // classpath; ignoreResourceNotFound
public class Chapter03Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter03Application.class, args);
	}

}

