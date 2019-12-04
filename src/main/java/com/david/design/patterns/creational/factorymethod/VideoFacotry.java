package com.david.design.patterns.creational.factorymethod;

/**
 * Created by wangwei on 2019/8/28.
 *  只定义规范，契约
 */
public abstract class VideoFacotry {
    // 电冰箱：海信，美的，海尔；
    // 以上他们三家的电冰箱属于同一产品等级
    public abstract Video getVideo();
}

