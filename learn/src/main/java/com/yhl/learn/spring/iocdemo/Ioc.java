package com.yhl.learn.spring.iocdemo;

import com.yhl.learn.spring.iocdemo.TeacherFactory;
import com.yhl.learn.spring.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @program: learn
 * @description: Ioc源码
 * @author: Yhl
 * @create: 2019-05-22 17:24
 **/

public class Ioc {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-text.xml");
       TeacherFactory factory = (TeacherFactory) applicationContext.getBean("teacherFactory");
      // factory.creatTeacher();
    }
}


