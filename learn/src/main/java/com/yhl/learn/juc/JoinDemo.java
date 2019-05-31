package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: learn
 * @description: Join举例
 * @author: Yhl
 * @create: 2019-05-20 21:30
 **/
@Slf4j
public class JoinDemo {
  /*  public static void main(String[] args) {
        Thread previousThread = Thread.currentThread();
        for (int i = 1; i <= 10; i++) {
            Thread curThread = new JoinThread(previousThread);
            curThread.start();
            previousThread = curThread;
        }

    }*/
    static class JoinThread extends Thread{
        private Thread thread;
        public  JoinThread(Thread thread){
            this.thread=thread;
        }
        @Override
        public void run() {
            try {
                thread.join();
                System.out.println(thread.getName() + " terminated.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            super.run();
        }
    }
}
