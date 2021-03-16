package com.meicloud.huadong.design_12_代理模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // Spring会自己注入，这里直接new
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
