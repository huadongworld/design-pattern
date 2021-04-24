package com.meicloud.huadong.design_23_状态模式;

/**
 * @author HuaDong
 * @date 2021/3/22 0:19
 */
public class StopState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进!!");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停!!");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}
