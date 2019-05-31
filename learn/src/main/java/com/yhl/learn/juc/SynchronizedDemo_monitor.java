package com.yhl.learn.juc;

/**
 * @program: learn
 * @description: monitor 机制
 * @author: Yhl
 * @create: 2019-05-21 09:50
 **/

public class SynchronizedDemo_monitor {
    public static void main(String[] args) {
        synchronized (SynchronizedDemo.class) {
        }
        method();
    }

    private static void method() {
    }
}

/**
 * javap -v SynchronizedDemo_monitor.class
 */
