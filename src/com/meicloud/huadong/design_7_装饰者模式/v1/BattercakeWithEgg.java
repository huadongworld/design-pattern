package com.meicloud.huadong.design_7_装饰者模式.v1;

/**
 * @author HuaDong
 * @date 2021/3/12 23:09
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
