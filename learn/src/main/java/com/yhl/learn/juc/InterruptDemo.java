package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

import static java.rmi.server.LogStream.log;

/**
 * @program: learn
 * @description: 线程状态中断
 * @author: Yhl
 * @create: 2019-05-20 21:09
 **/
@Slf4j
public class InterruptDemo {
   /* public static void main(String[] args) {
        final Thread sleepThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        final Thread busyThread = new Thread(() -> {
            while (true) {
            }
        });
        sleepThread.start();
        busyThread.start();
        sleepThread.interrupt();
        busyThread.interrupt();
     //   while (sleepThread.interrupted());
        System.out.println("sleepThread isInterrupted: " + sleepThread.interrupted());
        System.out.println("busyThread isInterrupted: " + busyThread.interrupted());
    }*/
}
