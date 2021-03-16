package com.meicloud.huadong.design_13_模板方法;

/**
 * @author HuaDong
 * @date 2021/3/16 23:03
 */
public abstract class ACourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    /**
     * 声明为final是不想让子类修改
     */
    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle() {
        System.out.println("编写手记");
    }
    /**
     * 钩子方法
     */
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();
}
