package com.meicloud.huadong.design_11_桥接模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
