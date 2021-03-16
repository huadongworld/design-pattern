package com.meicloud.huadong.design_12_代理模式.dynamicproxy;

import com.meicloud.huadong.design_12_代理模式.IOrderService;
import com.meicloud.huadong.design_12_代理模式.Order;
import com.meicloud.huadong.design_12_代理模式.OrderServiceImpl;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class Test {
    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy =
                (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
