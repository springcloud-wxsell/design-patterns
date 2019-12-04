package com.david.design.patterns.creational.builder;

/**
 * Created by wangwei on 2019/8/30.
 */
public abstract class CourseBuilder {


    public abstract void buildCourseName(String coruseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String coruseQA);


    public abstract Course createCourse();

}
