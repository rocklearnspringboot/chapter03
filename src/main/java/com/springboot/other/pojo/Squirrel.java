package com.springboot.other.pojo;

import com.springboot.chapter03.pojo.definition.Animal;


public class Squirrel implements Animal {

    @Override
    public void use() {
        System.out.println("松鼠可以采集松果");
    }

}
