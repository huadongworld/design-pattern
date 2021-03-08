package com.meicloud.huadong.design_2_工厂方法;

/**
 * @author HuaDong
 * @date 2021/3/8 21:32
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
