package com.springboot.chapter03.pojo;

import com.springboot.chapter03.pojo.definition.Animal;
import com.springboot.chapter03.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {

//    @Autowired  // use type of property to find the corresponding Bean
//    @Qualifier("cat")
//    private Animal animal = null;
    private Animal animal = null;

    public BusinessPerson(@Autowired @Qualifier("cat") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("delay the DI");
        this.animal = animal;
    }
}
