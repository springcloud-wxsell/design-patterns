package com.david.design.patterns.structural.decorator;

/**
 * @author : wangwei
 * @date : Created in 2020/1/21 22:35
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个煎蛋 ";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
