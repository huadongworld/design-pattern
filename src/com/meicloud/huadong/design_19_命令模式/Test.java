package com.meicloud.huadong.design_19_命令模式;

/**
 * @author HuaDong
 * @date 2021/3/20 23:19
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        OpenCourseCommand openCourseCommand = new OpenCourseCommand(course);
        CloseCourseCommand closeCourseCommand = new CloseCourseCommand(course);

        Staff staff = new Staff();
        staff.addCommand(openCourseCommand);
        staff.addCommand(closeCourseCommand);

        staff.executeCommands();
    }
}
