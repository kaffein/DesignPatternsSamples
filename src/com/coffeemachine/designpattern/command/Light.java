package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 7:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Light {
    private String location = "Default";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light on : " + location );
    }

    public void off() {
        System.out.println("Light off : " + location );
    }
}
