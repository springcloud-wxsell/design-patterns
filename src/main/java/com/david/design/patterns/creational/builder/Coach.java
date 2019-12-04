package com.david.design.patterns.creational.builder;

/**
 * Created by wangwei on 2019/8/30.
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public Coach(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course createCourse(String courseName, String coursePPT, String courseVideo, String courseArticle, String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.createCourse();
    }
}
