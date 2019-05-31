package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * @program: learn
 * @description: Executors提供的四种线程池
 * @author: Yhl
 * @create: 2019-05-21 16:17
 **/
@Slf4j
public class ExecutorsDemo {

 /*   public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
        ExecutorService fixed = Executors.newFixedThreadPool(10);
        //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        ExecutorService cached = Executors.newCachedThreadPool();
        //创建一个定长线程池，支持定时及周期性任务执行。
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(10);
        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务
        ExecutorService single = Executors.newSingleThreadExecutor();
        //手动创建线程池
        *//**
         * corePoolSize 线程池基本大小
         * maximumPoolSize  线程池允许最大线程数
         * keepAliveTime 线程存活时间 超时退出
         * TimeUnit 时间单位
         * BlockingQueue 任务队列
         * ThreadFactory 线程工厂
         * RejectedExecutionHandler 拒绝策略
         * AbortPolicy         -- 当任务添加到线程池中被拒绝时，它将抛出 RejectedExecutionException 异常。
         * CallerRunsPolicy    -- 当任务添加到线程池中被拒绝时，会在线程池当前正在运行的Thread线程池中处理被拒绝的任务。
         * DiscardOldestPolicy -- 当任务添加到线程池中被拒绝时，线程池会放弃等待队列中最旧的未处理任务，然后将被拒绝的任务添加到等待队列中。
         * DiscardPolicy       -- 当任务添加到线程池中被拒绝时，线程池将丢弃被拒绝的任务。
         *//*
        ExecutorService pool = new ThreadPoolExecutor(10, 10, 10l, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(512), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

      *//*  for (int i = 0; i < 20; i++) {
            fixed.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("当前线程：" + Thread.currentThread());
            });
        }

        for (int i = 0; i < 20; i++) {
            cached.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("当前线程：" + Thread.currentThread());
            });
        }*//*
       *//* for (int i = 0; i < 10; i++) {
            single.execute(() -> {
                try {
                    Thread.sleep(1000);
                    log.info("当前线程：" + Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }*//*
      *//*  for (int i = 0; i < 10; i++) {
            scheduled.scheduleAtFixedRate(() -> {
                log.info("schedule");
            }, 0, 5, TimeUnit.SECONDS);
        }*//*

*//*
        Future<String> future = pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello";
            }
        });
        try {
            log.info(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        pool.submit(()->{
            log.info("pool:"+"Runnable");
        });*//*

*//*
* 传入参数执行后返回
* *//*
       Future<String> future1= pool.submit(()->{

        },"nihao");

       log.info(future1.get());




    }*/

}
