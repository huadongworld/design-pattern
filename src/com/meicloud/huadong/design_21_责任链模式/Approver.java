package com.meicloud.huadong.design_21_责任链模式;

/**
 * @author HuaDong
 * @date 2021/3/21 0:58
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
