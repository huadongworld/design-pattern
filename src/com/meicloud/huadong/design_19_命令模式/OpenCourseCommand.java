package com.meicloud.huadong.design_19_命令模式;

/**
 * @author HuaDong
 * @date 2021/3/20 23:18
 */
public class OpenCourseCommand implements Command {
    private Course course;

    public OpenCourseCommand(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
        course.open();
    }
}
