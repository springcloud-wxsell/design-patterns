package com.david.design.patterns.creational.abstractfactory;

/**
 * Created by wangwei on 2019/8/29.
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产 java 课程视频");
    }
}
