package com.yhl.learn.lambda;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.*;

import static java.util.Comparator.comparing;


/**
 * @program: learn
 * @description: 常用的lambda
 * @author: Yhl
 * @create: 2019-05-21 21:19
 **/
@Slf4j
public class lambdaDemo {
    public static void main(String[] args) {
        /**
         * Predicate<T> 判断接口 函数式接口
         * 判断T
         */
       /* Predicate<String> predicate=a-> {a="I am "+a; return a.contains("I am predicate");};
        if(predicate.test("predicate")){
            log.info("判断正确");
        }else {
            log.info("失败");
        }*/

        /**
         * 接收参数不返回
         */
       /* Consumer<String> consumer = a -> {
            log.info(a + " Consumer");
        };
        consumer.accept("Hello");
*/
        /**
         * Function<T,R>接收T返回R
         */
      /*  Function<Integer,String> function=a->{
            return a.toString();
        };
        log.info(function.apply(100));

        *//**
         *  Supplier<T> 不接受参数 返回T类型数据
         *//*
        Supplier<String> supplier=()-> "Supplier";

        log.info(supplier.get());*/

        /**
         * 接收T 返回T
         */
       /* UnaryOperator<Integer> unaryOperator=a->{
            return a*2;
        };

        log.info(String.valueOf(unaryOperator.apply(100)));*/


        //change();
        methodQuote();

    }


    /**
     * lambda 有效只读变量 当一个变量从声明到lambda表达式之前未被改变过
     * 则认为可读取的编译不会出错  有效只读变量就是指再加上final不会报错的变量
     *
     * @param name
     * @return
     */
    Callable<String> helloCallable(String name) {
        String hello = "Hello";
        //改变hello变量则会出错
        //hello=hello+"";
        return () -> (hello + ", " + name);
    }


    static void change() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int sum;
        int max;
        int min;
        /**
         * 禁止修改有效变量 对值封闭
         */
        //list.forEach(e -> { sum += e; });

        /**
         *  对变量开放
         *
         */
        List<Integer> alist = new ArrayList<>();
        list.forEach(e -> {
            log.info(e.toString());
            alist.add(e);
        });
        alist.forEach(e -> {
            log.info(e.toString());
        });

        /**
         * 使用规约reduction更改变量
         * java.util.stream 提供了各种规约
         */
        sum = list.stream().mapToInt(e -> e).sum();
        max = list.stream().mapToInt(e -> e).max().getAsInt();
        min = list.stream().mapToInt(e -> e).min().getAsInt();
        log.info("list 数据总和：" + sum + " 最大值： " + max + " 最小值：" + min);

    }


    static void methodQuote() {
        Person[] people = {new Person("李四", 22), new Person("张三", 20), new Person("王二", 23)};
        // Comparator<Person> byName=Comparator.comparing(p->p.getName());
        //重写Function内的方法 可以调用已有的方法
        Comparator<Person> byName = comparing(Person::getName);
        // Comparator<Person> byAge=Comparator.comparing(p->p.getAge());
        Comparator<Person> byAge = comparing(Person::getAge).reversed();
        Arrays.sort(people, byName);
        Arrays.sort(people, byAge);
        for (Person person : people) {
            log.info(person.getName() + ": " + person.getAge());
        }

        //使用已有方法
        Function<String, String> upperfier = lambdaDemo::uptest;
        log.info(upperfier.apply("表达式"));


    }

    private static String uptest(String s) {
        return "hello " + s;
    }


    @Data
    static
    class Person {
        private final String name;
        private final int age;
    }


    /**
     * lambda  简化举例
     */
    void simple() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("李四", 22));
        people.add(new Person("李五", 24));
        people.add(new Person("李六", 21));
        //代码冗余
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person x, Person y) {
                return x.getName().compareTo(y.getName());
            }
        });
        //简单了 但是有一些原始比较函数又要重写一次
        Collections.sort(people, (a, b) -> a.getName().compareTo(b.getName()));

        //调用Comparator生成比较器
        Collections.sort(people, comparing(p -> p.getName()));

        //在类型推导和静态导入的帮助下，我们可以进一步简化
        Collections.sort(people, comparing(p -> p.getName()));

        //我们注意到这里的 lambda 表达式实际上是 getLastName 的代理（forwarder），于是我们可以用方法引用代替它：
        Collections.sort(people, comparing(Person::getName));

        //最后，使用 Collections.sort 这样的辅助方法并不是一个好主意：它不但使代码变的冗余，
        // 也无法为实现 List 接口的数据结构提供特定（specialized）的高效实现，而且由于 Collections.sort 方法不属于 List 接口，
        //用户在阅读 List 接口的文档时不会察觉在另外的 Collections 类中还有一个针对 List 接口的排序（sort()）方法。
        //默认方法可以有效的解决这个问题，我们为 List 增加默认方法 sort()，然后就可以这样调用：
        people.sort(comparing(Person::getName));

        //此外，如果我们为 Comparator 接口增加一个默认方法 reversed()（产生一个逆序比较器），
        // 我们就可以非常容易的在前面代码的基础上实现降序排序。
        people.sort(comparing(Person::getName).reversed());
        ;


    }
}
