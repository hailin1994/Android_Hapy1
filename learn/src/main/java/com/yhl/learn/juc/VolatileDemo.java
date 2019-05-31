package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: learn
 * @description: VolatileDemo
 * @author: Yhl
 * @create: 2019-05-21 10:12
 **/
@Slf4j
public class VolatileDemo {
    private static volatile boolean isOver=false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
          while (!isOver){
              log.info("volatile is no change");
          }
        }).start();
        Thread.sleep(1000);
        isOver=true;
    }
}
