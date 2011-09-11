package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class CeilingFan {
    private String location = "Default location";

    public CeilingFan() {
    }

    public CeilingFan(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("CEILING FAN ON " + location);
    }

    public void off() {
        System.out.println("CEILING FAN OFF : " + location);
    }
}
