package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        System.out.println("Up garage door!!");
    }

    public void undo() {
        System.out.println("Down garage door");
    }
}
