package com.meicloud.huadong.design_17_观察者模式;

import java.util.Observable;
import java.util.Observer;

/**
 * @author HuaDong
 * @date 2021/3/19 21:57
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问答:" + question.getQuestionContent());
    }
}
