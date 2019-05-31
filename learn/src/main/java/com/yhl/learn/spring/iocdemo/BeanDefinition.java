package com.yhl.learn.spring.iocdemo;

import lombok.Data;

/**
 * @program: learn
 * @description: 类定义
 * @author: Yhl
 * @create: 2019-05-23 13:38
 **/
@Data
public class BeanDefinition {
    private String beanId;
    private String classPath;
    private String scop="single";

}
