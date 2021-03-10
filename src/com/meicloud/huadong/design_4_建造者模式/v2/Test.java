package com.meicloud.huadong.design_4_建造者模式.v2;

/**
 * @author HuaDong
 * @date 2021/3/9 20:59
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("设计模式")
                .buildCoursePPT("设计模式精讲PPT")
                .buildCourseVideo("设计模式精讲视频")
                .build();
        System.out.println(course);
    }
}
