package com.coffeemachine.designpattern.strategy;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
