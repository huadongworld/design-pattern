package com.meicloud.huadong.design_8_适配器模式.classadapter;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
