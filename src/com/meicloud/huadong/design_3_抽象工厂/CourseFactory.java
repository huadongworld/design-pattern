package com.meicloud.huadong.design_3_抽象工厂;

/**
 * @author HuaDong
 * @date 2021/3/9 19:51
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
