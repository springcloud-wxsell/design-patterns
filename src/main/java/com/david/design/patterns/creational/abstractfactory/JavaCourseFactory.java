package com.david.design.patterns.creational.abstractfactory;

/**
 * Created by wangwei on 2019/8/29.
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
