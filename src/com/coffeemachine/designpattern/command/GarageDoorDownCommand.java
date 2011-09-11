package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
