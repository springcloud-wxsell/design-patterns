package com.david.design.patterns.creational.factorymethod;

/**
 * Created by wangwei on 2019/8/28.
 */
public class PythonVideoFactory extends VideoFacotry {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
