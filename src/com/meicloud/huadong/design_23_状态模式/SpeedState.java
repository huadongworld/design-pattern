package com.meicloud.huadong.design_23_状态模式;

/**
 * @author HuaDong
 * @date 2021/3/22 0:19
 */
public class SpeedState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
