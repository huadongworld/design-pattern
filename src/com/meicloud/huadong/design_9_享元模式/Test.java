package com.meicloud.huadong.design_9_享元模式;

/**
 * @author HuaDong
 * @date 2021/3/13 14:48
 */
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 随机
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
//
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:" + (a == b));
        System.out.println("c==d:" + (c == d));

    }
}
