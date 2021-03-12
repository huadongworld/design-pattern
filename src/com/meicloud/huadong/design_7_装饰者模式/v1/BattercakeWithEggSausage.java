package com.meicloud.huadong.design_7_装饰者模式.v1;

/**
 * @author HuaDong
 * @date 2021/3/12 23:09
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
