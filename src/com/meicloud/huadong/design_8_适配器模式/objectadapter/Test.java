package com.meicloud.huadong.design_8_适配器模式.objectadapter;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class Test {
    public static void main(String[] args) {
        // 直接实现
        Target target = new ConcreteTarget();
        target.request();

        // 适配器实现
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
