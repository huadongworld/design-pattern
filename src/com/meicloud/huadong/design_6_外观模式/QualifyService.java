package com.meicloud.huadong.design_6_外观模式;

/**
 * @author HuaDong
 * @date 2021/3/10 21:22
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存通过");
        return true;
    }
}
