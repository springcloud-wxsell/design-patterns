package com.david.design.patterns.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * Created by wangwei on 2019/9/1.
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式精讲")
                .buildCourseArticle("java设计模式精讲手记").buildCourseVideo("java设计模式精讲视频").build();
        System.out.println(course);
        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);
    }
}
