package com.david.design.patterns.creational.singleton;

/**
 * Created by wangwei on 2019/9/1.
 */
public class TestSingleton {

    public static void main(String[] args) {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        System.out.println("program end");

    }
}
