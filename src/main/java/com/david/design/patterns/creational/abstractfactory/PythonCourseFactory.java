package com.david.design.patterns.creational.abstractfactory;

/**
 * Created by wangwei on 2019/8/29.
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
