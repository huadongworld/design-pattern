package com.meicloud.huadong.design_2_工厂方法;

/**
 * 只制定规范契约，并不决定产生哪一种类的实例，产生哪一种实例完全交由子类实现
 *
 * @author HuaDong
 * @date 2021/3/8 21:32
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
