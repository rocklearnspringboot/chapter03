package com.springboot.chapter03.pojo;

import com.springboot.chapter03.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("Cat【" + Cat.class.getSimpleName()+"】used to catch mouse。");
    }

}
