package com.yhl.learn.spring.aop;

import lombok.Data;

/**
 * @program: learn
 * @description: 代理类
 * @author: Yhl
 * @create: 2019-05-29 14:20
 **/


@Data
class PersonProxy implements Action{
    Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public String run() {
        System.out.println(person.getName()+"换上跑步鞋");
        person.run();
        System.out.println(person.getName()+"跑完了");
        return "true";
    }

    @Override
    public String eat() {
        System.out.println(person.getName()+"洗手");
        person.eat();
        System.out.println(person.getName()+"吃完了");
        return "true";
    }
}
