package com.meicloud.huadong.design_8_适配器模式;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
