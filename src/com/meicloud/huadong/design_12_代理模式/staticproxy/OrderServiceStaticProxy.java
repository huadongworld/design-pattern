package com.meicloud.huadong.design_12_代理模式.staticproxy;

import com.meicloud.huadong.design_12_代理模式.IOrderService;
import com.meicloud.huadong.design_12_代理模式.Order;
import com.meicloud.huadong.design_12_代理模式.OrderServiceImpl;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        System.out.println("静态代理 before code");
    }
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
