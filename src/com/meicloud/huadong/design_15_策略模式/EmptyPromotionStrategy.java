package com.meicloud.huadong.design_15_策略模式;

/**
 * @author HuaDong
 * @date 2021/3/16 23:50
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
