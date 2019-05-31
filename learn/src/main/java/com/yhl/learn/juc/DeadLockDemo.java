package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: learn
 * @description: 死锁举例
 * @author: Yhl
 * @create: 2019-05-20 20:30
 **/
@Slf4j
public class DeadLockDemo {
    private static String resource_a="A";
    private static String resource_b="B";

    /*public static void main(String[] args) {
        new Thread(()->{
            synchronized (resource_a){
              log.info("get resource_a");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource_b){
                    log.info("get resource_b");
                }
            }
        }).start();
        new Thread(()->{
            synchronized (resource_b){
                log.info("get resource_b");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource_a){
                    log.info("get resource_a");
                }
            }
        }).start();
    }*/

}
