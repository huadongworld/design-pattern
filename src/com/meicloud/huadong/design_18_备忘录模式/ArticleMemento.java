package com.meicloud.huadong.design_18_备忘录模式;

/**
 * @author HuaDong
 * @date 2021/3/19 22:43
 */
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;

    public ArticleMemento(String title, String content, String imgs) {
        this.title = title;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
