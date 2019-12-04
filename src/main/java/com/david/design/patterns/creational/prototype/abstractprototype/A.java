package com.david.design.patterns.creational.prototype.abstractprototype;

/**
 * Created by wangwei on 2019/10/25.
 */
public abstract class A implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
