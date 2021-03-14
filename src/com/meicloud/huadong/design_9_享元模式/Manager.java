package com.meicloud.huadong.design_9_享元模式;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class Manager implements Employee {

    private String title = "部门经理";
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
