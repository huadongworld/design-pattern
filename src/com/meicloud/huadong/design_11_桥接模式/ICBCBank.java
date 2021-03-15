package com.meicloud.huadong.design_11_桥接模式;

/**
 * @author HuaDong
 * @date 2021/3/15 20:35
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
