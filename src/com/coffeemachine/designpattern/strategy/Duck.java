package com.coffeemachine.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Duck {
    FlyBehaviour flybehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flybehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks swim, even decoys");
    }

    protected void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flybehaviour = flyBehaviour;
    }

    protected FlyBehaviour getFlyBehaviour() {
        return flybehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

}
