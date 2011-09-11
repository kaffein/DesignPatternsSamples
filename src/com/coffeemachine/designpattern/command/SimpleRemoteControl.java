package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleRemoteControl {
    private Command command;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
