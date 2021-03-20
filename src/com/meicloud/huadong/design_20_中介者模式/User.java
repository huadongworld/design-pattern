package com.meicloud.huadong.design_20_中介者模式;

/**
 * @author HuaDong
 * @date 2021/3/20 23:59
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
