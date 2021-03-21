package com.meicloud.huadong.design_22_访问者模式;

/**
 * @author HuaDong
 * @date 2021/3/21 0:58
 */
public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
