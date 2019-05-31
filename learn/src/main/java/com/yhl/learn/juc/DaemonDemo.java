package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: learn
 * @description: 守护进程
 * @author: Yhl
 * @create: 2019-05-21 09:15
 **/
@Slf4j
public class DaemonDemo {
    /*public static void main(String[] args) {
        Thread daemonThread=new Thread(()->{
            while (true){
                log.info("I am alive");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    log.info("daemonthread exit");
                }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
