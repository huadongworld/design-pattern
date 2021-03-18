package com.meicloud.huadong.design_15_策略模式;

/**
 * @author HuaDong
 * @date 2021/3/16 23:50
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}
