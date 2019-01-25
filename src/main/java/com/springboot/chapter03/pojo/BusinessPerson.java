package com.springboot.chapter03.pojo;

import com.springboot.chapter03.pojo.definition.Animal;
import com.springboot.chapter03.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {

    @Autowired  // use type of property to find the corresponding Bean
    private Animal dog = null;

    @Override
    public void service() {
        this.dog.use();
    }

    @Override
    public void setDog(Animal animal) {
        this.dog = animal;
    }
}
