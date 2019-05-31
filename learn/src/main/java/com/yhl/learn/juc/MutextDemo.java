package com.yhl.learn.juc;

/**
 * @program: learn
 * @description: 测试自定义锁
 * @author: Yhl
 * @create: 2019-05-21 13:57
 **/

public class MutextDemo {
    private static Mutex mutex = new Mutex();

  /*  public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                mutex.lock();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mutex.unlock();
                }
            });
            thread.start();
        }
    }*/
}
