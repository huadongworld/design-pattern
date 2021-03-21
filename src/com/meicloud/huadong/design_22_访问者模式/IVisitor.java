package com.meicloud.huadong.design_22_访问者模式;

/**
 * @author HuaDong
 * @date 2021/3/21 0:58
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
