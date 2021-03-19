package com.meicloud.huadong.design_18_备忘录模式;

import java.util.Stack;

/**
 * @author HuaDong
 * @date 2021/3/19 22:43
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

}
