package com.meicloud.huadong.design_12_代理模式.staticproxy;

import com.meicloud.huadong.design_12_代理模式.Order;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
