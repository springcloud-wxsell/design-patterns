package com.david.design.patterns.creational.singleton;

/**
 * Created by wangwei on 2019/9/2.
 */
public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.instance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
