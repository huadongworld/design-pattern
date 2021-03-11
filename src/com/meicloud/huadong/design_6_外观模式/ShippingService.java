package com.meicloud.huadong.design_6_外观模式;

/**
 * @author HuaDong
 * @date 2021/3/10 21:22
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
