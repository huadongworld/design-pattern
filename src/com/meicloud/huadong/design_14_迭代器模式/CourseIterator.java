package com.meicloud.huadong.design_14_迭代器模式;

/**
 * @author HuaDong
 * @date 2021/3/16 23:50
 */
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
