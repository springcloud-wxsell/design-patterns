package com.david.design.patterns.creational.prototype.clone;

import com.david.design.patterns.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by wangwei on 2019/10/25.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇", birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//        pig1.getBirthday().setTime(66666666666L);
//        System.out.println(pig1);
//        System.out.println(pig2);

        /**
         *  克隆会破快单例
         *  防止克隆破坏单例的方法：
         *  1. 单例类不要实现 Cloneable 接口
         *  2. 实现 Cloneable 接口, clone() 方法要调用获取实例的方法
         */
//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);
    }
}
