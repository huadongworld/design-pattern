package com.meicloud.huadong.design_11_桥接模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号（委托给实现处理）");
    }
}
