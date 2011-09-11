package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
