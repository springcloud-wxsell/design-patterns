package com.david.design.patterns.structural.decorator;

import javax.sound.midi.Soundbank;

/**
 * @author : wangwei
 * @date : Created in 2020/1/21 22:38
 * @description: ${description}
 * @modified By:
 * @version: ${version}
 */
public class Test {

    public static void main(String[] args) {
        ABattercake battercake = null;
        battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getDesc() + " 销售价格: " + battercake.cost() + " 元");
    }
}
