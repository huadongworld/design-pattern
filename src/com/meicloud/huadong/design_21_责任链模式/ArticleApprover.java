package com.meicloud.huadong.design_21_责任链模式;

/**
 * @author HuaDong
 * @date 2021/3/21 0:58
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course.getArticle() != null) {
            System.out.println(course.getName() + "含有手记,批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记,不批准,流程结束");
        }
    }
}
