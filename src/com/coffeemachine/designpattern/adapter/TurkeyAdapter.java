package com.coffeemachine.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/17/11
 * Time: 7:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
