package com.meicloud.huadong.design_11_桥接模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        // ...
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号（委托给实现处理）");
    }
}
