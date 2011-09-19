package com.coffeemachine.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/17/11
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble!!");
    }

    public void fly() {
        System.out.println("I am flying a short distance!!");
    }
}
