package com.david.design.patterns.creational.builder;

/**
 * Created by wangwei on 2019/8/30.
 */
public class Course {

    /**
     * 课程名
     */
    private String courseName;

    private String coursePPT;

    private String courseVideo;

    private String courseArticle;

    private String coruseQA;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCoruseQA() {
        return coruseQA;
    }

    public void setCoruseQA(String coruseQA) {
        this.coruseQA = coruseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", coruseQA='" + coruseQA + '\'' +
                '}';
    }
}
