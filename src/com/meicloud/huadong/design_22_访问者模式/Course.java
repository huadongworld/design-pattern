package com.meicloud.huadong.design_22_访问者模式;

/**
 * @author HuaDong
 * @date 2021/3/21 0:58
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
