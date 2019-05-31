package com.yhl.learn;

import com.yhl.learn.spring.aop.Person;
import com.yhl.learn.spring.aop.Some;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {
    @Autowired
    public Some some;

    @Test
    public void contextLoads() {
        some.doSomeThing(new Person("Tom"));
    }

}
