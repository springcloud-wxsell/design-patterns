package com.david.design.patterns.structural.decorator;

/**
 * @author : wangwei
 * @date : Created in 2020/1/21 22:28
 * @description: 抽象的被装饰者
 * @modified By:
 * @version: ${version}
 */
public abstract class AbstractDecorator implements ABattercake {

    private ABattercake battercake;

    protected abstract void doSomething();

    public AbstractDecorator(ABattercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getDesc() {
        return battercake.getDesc();
    }

    @Override
    public int cost() {
        return battercake.cost();
    }
}
