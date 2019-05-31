package com.yhl.learn.spring.iocdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: learn
 * @description: 自定义Ioc测试类
 * @author: Yhl
 * @create: 2019-05-23 14:07
 **/
@Slf4j
public class IocDemo {
    /*public static void main(String[] args) throws Exception {
        List<BeanDefinition> beanDefinitionList=new ArrayList<>();
        BeanDefinition beanDefinition=new BeanDefinition();
        beanDefinition.setBeanId("teacher");
        beanDefinition.setClassPath("com.yhl.learn.spring.iocdemo.Teacher");
        //beanDefinition.setScop("prototype");
        beanDefinitionList.add(beanDefinition);
        BeanFactory beanFactory=new BeanFactory(beanDefinitionList);
        beanFactory.setBeanDefinitionList(beanDefinitionList);
        Teacher teacher= (Teacher) beanFactory.getBean("teacher");
        Teacher teacher2= (Teacher) beanFactory.getBean("teacher");
        System.out.println(teacher.toString());
        System.out.println(teacher2.toString());
    }*/
}
