package com.meicloud.huadong.design_8_适配器模式.objectadapter;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
