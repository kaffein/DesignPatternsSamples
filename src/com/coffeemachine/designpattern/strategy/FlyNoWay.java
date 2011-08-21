package com.coffeemachine.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 8:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyNoWay implements FlyBehaviour {
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
