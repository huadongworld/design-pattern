package com.meicloud.huadong.design_8_适配器模式.classadapter;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
