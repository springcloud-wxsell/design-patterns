package com.david.design.patterns.creational.singleton;

/**
 * Created by wangwei on 2019/9/1.
 *
 * 懒汉式：注重延迟加载，只有在使用它的时候在加载
 * 线程不安全
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
