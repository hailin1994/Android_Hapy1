package com.yhl.learn.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectDemoTest {
    @Autowired
     private Some some;
    @Test
    public void logPrintTest() {
        some.doSomeThing(new Person("Tom"));
    }
}