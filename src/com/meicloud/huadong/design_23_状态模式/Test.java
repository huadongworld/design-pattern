package com.meicloud.huadong.design_23_状态模式;

/**
 * @author HuaDong
 * @date 2021/3/22 0:19
 */
public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态:" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态:" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();

        System.out.println("当前状态:" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();

        System.out.println("当前状态:" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
    }
}
