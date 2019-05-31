package com.yhl.learn.spring.aop;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: learn
 * @description: 代理模式 动态代理 JDK Proxy
 * @author: Yhl
 * @create: 2019-05-28 15:34
 **/

@Data
public class DynamicProxyDemo {

    public static void main(String[] args) {
        Person person=new Person("Tom");

        Action personP=(Action) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),(ob,me,arg)->{
            //接收方法的返回值
            Object result=null;
            if(me.getName().equals("eat")){
                System.out.println(person.getName()+"洗手");
                result= me.invoke(person,arg);
                return null;
            }else {
                result=me.invoke(person,arg);
            }
            return result;
        });
        //返回值为空
        String s=personP.eat();
        //正常返回值
        String t=personP.run();
        System.out.println(s);
        System.out.println(t);

    }



}



