package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------REMOTE CONTROL----------\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + " " + offCommands[i].getClass().getName() + "\n");
        }

        return buffer.toString();
    }

}
