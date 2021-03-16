package com.meicloud.huadong.design_12_代理模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
