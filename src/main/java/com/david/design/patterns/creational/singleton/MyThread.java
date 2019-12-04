package com.david.design.patterns.creational.singleton;

/**
 * Created by wangwei on 2019/9/1.
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        //LazySingleton instance = LazySingleton.getInstance();
        //LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }
}
