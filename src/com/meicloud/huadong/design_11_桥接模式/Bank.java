package com.meicloud.huadong.design_11_桥接模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();
}
