package com.yhl.learn.spring.aop;

import lombok.Data;

/**
 * @program: learn
 * @description:
 * @author: Yhl
 * @create: 2019-05-29 14:19
 **/


@Data
public class Person implements Action {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String run() {
        System.out.println(this.name + "is runing");
        return "true";
    }

    @Override
    public String eat() {
        System.out.println(this.name + "is eating");
        return "true";
    }
}