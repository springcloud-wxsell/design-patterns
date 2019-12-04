package com.david.design.patterns.creational.builder;

/**
 * Created by wangwei on 2019/8/30.
 */
public class Test {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach(courseBuilder);
        Course course = coach.createCourse("java设计模式精讲",
                "java设计模式精讲ppt",
                "java设计模式精讲视频",
                "java设计模式精讲手记",
                "java设计模式精讲问答");
        System.out.println(course);
    }
}
