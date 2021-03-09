package com.meicloud.huadong.design_3_抽象工厂;

/**
 * @author HuaDong
 * @date 2021/3/9 19:51
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
