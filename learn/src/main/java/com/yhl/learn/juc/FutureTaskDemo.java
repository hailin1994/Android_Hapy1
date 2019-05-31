package com.yhl.learn.juc;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: learn
 * @description: FutureTask测试 开启十个线程每个线程判断1000个数据
 * @author: Yhl
 * @create: 2019-05-21 19:33
 *
 * FutureTask 特性集成Runable Callable Future
 **/
@Slf4j
public class FutureTaskDemo {
   /* public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<FutureTask<Integer>> list = new ArrayList<>();
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            FutureTask<Integer> futureTask = new FutureTask<Integer>(() -> {
                int count = 0;
                int num = 1000 * finalI;
                for (int j = num; j < num + 1000; j++) {
                    if (isPrime(j)) {
                        log.info("质数：" + j);
                        count++;
                    }
                }
                return count;
            });
            executorService.submit(futureTask);
            list.add(futureTask);
        }
        for (FutureTask<Integer> futureTask : list) {
            sum = sum + futureTask.get();
        }
        log.info("10000 内的质数总共有：" + sum);
        executorService.shutdown();
    }*/

    public static boolean isPrime(Integer num) {
        if(num==0 || num==1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
