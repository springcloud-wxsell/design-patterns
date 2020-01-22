package com.david.design.patterns.structural.decorator;

/**
 * @author : wangwei
 * @date : Created in 2020/1/21 22:31
 * @description: 实际装饰者
 * @modified By:
 * @version: ${version}
 */
public class SausageDecorator extends AbstractDecorator {


    public SausageDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠 ";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
