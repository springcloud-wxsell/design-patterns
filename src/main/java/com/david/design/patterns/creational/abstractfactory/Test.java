package com.david.design.patterns.creational.abstractfactory;

/**
 * Created by wangwei on 2019/8/29.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.write();
    }
}
