package com.meicloud.huadong.design_7_装饰者模式.v2;

/**
 * @author HuaDong
 * @date 2021/3/12 23:09
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());
    }
}
