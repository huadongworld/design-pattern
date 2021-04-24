package com.meicloud.huadong.design_23_状态模式;

/**
 * @author HuaDong
 * @date 2021/3/22 0:19
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();

    public abstract void speed();

    public abstract void pause();

    public abstract void stop();

}
