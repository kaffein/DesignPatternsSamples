package com.coffeemachine.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/17/11
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack!!");
    }

    public void fly() {
        System.out.println("I am flying!!");
    }
}
