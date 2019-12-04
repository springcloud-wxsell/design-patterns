package com.david.design.patterns.creational.factorymethod;

/**
 * Created by wangwei on 2019/8/28.
 */
public class Test {
    public static void main(String[] args) {
        VideoFacotry facotry = new PythonVideoFactory();
        Video video = facotry.getVideo();
        video.produce();
    }
}
