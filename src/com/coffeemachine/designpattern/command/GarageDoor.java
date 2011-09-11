package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 7:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class GarageDoor {

    public void up() {
        System.out.println("Up door");
    }

    public void down() {
        System.out.println("Down door");
    }

    public void stop() {
        System.out.println("Stop door");
    }

    public void lightOn() {
        System.out.println("Door light on");
    }

    public void lightOff() {
        System.out.println("Door light off");
    }

    public void open() {
        System.out.println("Open door");
    }

    public void close() {
        System.out.println("Close door");
    }

}
