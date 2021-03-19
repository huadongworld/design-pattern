package com.meicloud.huadong.design_17_观察者模式;

import java.util.Observable;

/**
 * @author HuaDong
 * @date 2021/3/19 21:57
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.courseName + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
