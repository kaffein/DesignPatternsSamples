package com.coffeemachine.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyRocketPowered implements FlyBehaviour {

    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}
