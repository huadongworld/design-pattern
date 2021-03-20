package com.meicloud.huadong.design_19_命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuaDong
 * @date 2021/3/20 23:19
 */
public class Staff {

    private List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
