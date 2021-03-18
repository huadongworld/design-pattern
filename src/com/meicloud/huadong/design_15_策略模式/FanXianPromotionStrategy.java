package com.meicloud.huadong.design_15_策略模式;

/**
 * @author HuaDong
 * @date 2021/3/16 23:50
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到慕课网用户的余额中");
    }
}
