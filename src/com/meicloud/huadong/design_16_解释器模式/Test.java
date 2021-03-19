package com.meicloud.huadong.design_16_解释器模式;

/**
 * Created by geely.
 */
public class Test {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果: " + result);
    }
}
