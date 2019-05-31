package com.yhl.learn.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @program: learn
 * @description: 处理测试类
 * @author: Yhl
 * @create: 2019-05-29 10:48
 **/

@Component
public class Some {
    @LogPrint
    public void doSomeThing(Person person) {
        System.out.println(person.getName()+": 正在处理一些业务");
    }


}