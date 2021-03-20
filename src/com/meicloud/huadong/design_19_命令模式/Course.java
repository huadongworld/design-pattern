package com.meicloud.huadong.design_19_命令模式;

/**
 * @author HuaDong
 * @date 2021/3/20 23:18
 */
public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程开放");
    }

    public void close() {
        System.out.println(this.name + "课程关闭");
    }
}
