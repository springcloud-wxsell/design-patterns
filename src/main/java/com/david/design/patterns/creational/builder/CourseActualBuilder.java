package com.david.design.patterns.creational.builder;

/**
 * Created by wangwei on 2019/8/30.
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();
    @Override
    public void buildCourseName(String coruseName) {
        course.setCourseName(coruseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String coruseQA) {
        course.setCoruseQA(coruseQA);
    }

    @Override
    public Course createCourse() {
        return course;
    }
}
