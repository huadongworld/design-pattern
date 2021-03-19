package com.meicloud.huadong.design_16_解释器模式;

/**
 * @author HuaDong
 * @date 2021/3/16 23:50
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
