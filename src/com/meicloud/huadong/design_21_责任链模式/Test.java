package com.meicloud.huadong.design_21_责任链模式;

/**
 * @author HuaDong
 * @date 2021/3/21 0:58
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式");
        course.setArticle("Java设计模式的手记");
        course.setVideo("Java设计模式的视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
