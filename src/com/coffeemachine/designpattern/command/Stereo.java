package com.coffeemachine.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/11/11
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stereo {
    private String location = "Default location";

    public Stereo() {
    }

    public Stereo(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
