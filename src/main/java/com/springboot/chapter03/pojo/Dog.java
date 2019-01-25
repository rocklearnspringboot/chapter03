package com.springboot.chapter03.pojo;

import com.springboot.chapter03.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("Dog" + Dog.class.getSimpleName() + " is used as door keeper");
    }
}
