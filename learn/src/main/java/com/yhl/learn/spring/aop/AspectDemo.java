package com.yhl.learn.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: learn
 * @description: 切面类
 * @author: Yhl
 * @create: 2019-05-29 10:07
 **/
@Aspect
@Component
public class AspectDemo {
    //定义切点
    @Pointcut("@annotation(com.yhl.learn.spring.aop.LogPrint)")
  //  @Pointcut("execution(* com.yhl.learn.spring.aop.Some.*(..))")
    public void pointcut() {
    }

    @Before(value = "pointcut()")
    void beforeAspect(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs());
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getSourceLocation());

        System.out.println("日志记录开始");
    }

    @After(value = "pointcut()")
    void afterAspect() {
        System.out.println("日志记录结束");
    }

}



