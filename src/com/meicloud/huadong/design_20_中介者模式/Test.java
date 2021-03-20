package com.meicloud.huadong.design_20_中介者模式;

/**
 * @author HuaDong
 * @date 2021/3/20 23:59
 */
public class Test {
    public static void main(String[] args) {
        User zhangsan = new User("张三");
        User lisi = new User("李四");

        zhangsan.sendMessage(" Hey! 李四! Let's learn Design Pattern");
        lisi.sendMessage(" OK! 张三");
    }
}
