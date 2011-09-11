package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 7:09 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    public void execute();
    public void undo();
}
