package com.david.design.patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by wangwei on 2019/9/2.
 */
public class TestReflect {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

//        Class objectClass = Class.forName("com.david.design.patterns.creational.singleton.HungrySingleton");
//        Constructor cons = objectClass.getDeclaredConstructor();
//        cons.setAccessible(true);
//        HungrySingleton newInstance = (HungrySingleton) cons.newInstance();
//
//        HungrySingleton instance = HungrySingleton.getInstance();

        Class objectClass = StaticInnerClassSingleton.class;
        Constructor cons = objectClass.getDeclaredConstructor();
        cons.setAccessible(true);
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) cons.newInstance();

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

        System.out.println(newInstance);
        System.out.println(instance);
        System.out.println(newInstance == instance);
    }
}
