package com.david.design.patterns.structural.facade;

/**
 * @author : wangwei
 * @date : Created in 2019/12/4 21:56
 * @description: 积分礼品
 * @modified By:
 * @version: ${version}
 */
public class PointsGift {

    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
