package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class NoCommand implements Command {

    public void execute() {
        System.out.println("NO COMMAND");
    }

    public void undo() {
    }
}
