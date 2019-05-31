package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @program: learn
 * @description: 新建线程的3中方式
 * @author: Yhl
 * @create: 2019-05-20 20:43
 **/
@Slf4j
public class ThreadDemo {
    public static void main(String[] args) {
        threadCreat1();
        threadCreat2();
        threadCreat3();
    }

    /**
     * new Thread 建立线程
     */
    public static void threadCreat1(){
        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                log.info("新建线程的第一种方式");
            }
        };
        thread.start();
    }

    /**
     *  Runnable
     */
    public static void threadCreat2(){
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("新建线程的第二种方式");
            }
        });
        thread.start();
    }

    /**
     * callable
     */
    public static void threadCreat3(){
        /*创建一个单例的线程池*/
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        /* Future<String> 接收带返回值的线程 Callable*/
        Future<String> future=executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "通过实现Callable接口";
            }
        });
        try {
            String result=future.get();
            log.info(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
