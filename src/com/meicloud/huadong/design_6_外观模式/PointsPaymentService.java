package com.meicloud.huadong.design_6_外观模式;

/**
 * @author HuaDong
 * @date 2021/3/10 21:22
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        // 扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }
}
