package com.david.design.patterns.creational.singleton;

import java.io.Serializable;

/**
 * Created by wangwei on 2019/9/2.
 */
public class HungrySingleton implements Serializable, Cloneable {

    private static final long serialVersionUID = 1886032978628922149L;
    private final static HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
