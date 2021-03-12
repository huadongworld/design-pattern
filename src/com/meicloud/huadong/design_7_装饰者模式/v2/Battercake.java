package com.meicloud.huadong.design_7_装饰者模式.v2;

/**
 * @author HuaDong
 * @date 2021/3/12 23:09
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
