package com.meicloud.huadong.design_6_外观模式;

/**
 * @author HuaDong
 * @date 2021/3/10 21:22
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
