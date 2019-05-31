package com.yhl.learn.spring.iocdemo;

import lombok.Data;

/**
 * @program: learn
 * @description: teacher实体类
 * @author: Yhl
 * @create: 2019-05-23 13:37
 **/

//@Data
public class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
