package com.coffeemachine.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 9/17/11
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says : ");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The duck says");
        testDuck(mallardDuck);

        System.out.println("The turkey adapter says : ");
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
