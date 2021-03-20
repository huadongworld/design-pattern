package com.meicloud.huadong.design_20_中介者模式;

import java.util.Date;

/**
 * @author HuaDong
 * @date 2021/3/20 23:59
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
