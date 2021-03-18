package com.meicloud.huadong.design_15_策略模式;

/**
 * @author HuaDong
 * @date 2021/3/16 23:50
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
