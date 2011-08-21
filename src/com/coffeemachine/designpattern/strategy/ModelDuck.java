package com.coffeemachine.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flybehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
