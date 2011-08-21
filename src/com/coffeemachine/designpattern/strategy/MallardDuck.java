package com.coffeemachine.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flybehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real mallard duck!!");
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }
}
