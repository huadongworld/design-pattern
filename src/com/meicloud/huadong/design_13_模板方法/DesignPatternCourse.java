package com.meicloud.huadong.design_13_模板方法;

/**
 * @author HuaDong
 * @date 2021/3/16 23:03
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
