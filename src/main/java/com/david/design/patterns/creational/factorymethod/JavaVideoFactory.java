package com.david.design.patterns.creational.factorymethod;

/**
 * Created by wangwei on 2019/8/28.
 */
public class JavaVideoFactory extends VideoFacotry {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
