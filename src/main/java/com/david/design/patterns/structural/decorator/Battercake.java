package com.david.design.patterns.structural.decorator;

/**
 * @author : wangwei
 * @date : Created in 2020/1/21 22:27
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class Battercake implements ABattercake {
    @Override
    public String getDesc() {
        return "煎饼 ";
    }

    @Override
    public int cost() {
        return 8;
    }
}
