package com.meicloud.huadong.design_5_原型模式.abstractprototype;

/**
 * @author HuaDong
 * @date 2021/3/10 21:22
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
