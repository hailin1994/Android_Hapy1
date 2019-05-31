package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: learn
 * @description: Synchronized举例 线程不安全
 * @author: Yhl
 * @create: 2019-05-21 09:35
 **/
@Slf4j
public class SynchronizedDemo implements Runnable {
    private static int count=0;

    public static void main(String[] args) {
        for (int i=0 ;i<10;i++){
            new Thread(new SynchronizedDemo()).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("result : "+count);
    }
    @Override
    public void run() {
        synchronized (SynchronizedDemo.class) {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
        }
    }
}
