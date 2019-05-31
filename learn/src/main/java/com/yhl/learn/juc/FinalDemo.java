package com.yhl.learn.juc;

/**
 * @program: learn
 * @description: Final 重排序规则
 * @author: Yhl
 * @create: 2019-05-21 10:26
 **/

/**
 * final
 * 普通域（普通变量）a可能会被重排序到构造函数之外，
 * 线程B就有可能读到的是普通变量a初始化之前的值（零值），
 * 这样就可能出现错误。而final域变量b，根据重排序规则，
 * 会禁止final修饰的变量b重排序到构造函数之外，从而b能够正确赋值
 * 在读一个对象的final域之前，一定会先读这个包含这个final域的对象的引用。
 */
public class FinalDemo {
    private int a;  //普通域
    private final int b; //final域
    private static FinalDemo finalDemo;

    public FinalDemo() {
        a = 1; // 1. 写普通域
        b = 2; // 2. 写final域
    }

    public static void writer() {
        finalDemo = new FinalDemo();
    }

    public static void reader() {
        FinalDemo demo = finalDemo; // 3.读对象引用
        int a = demo.a;    //4.读普通域
        int b = demo.b;    //5.读final域
    }


}
