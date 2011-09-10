package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "New York style veggie pizza";
        dough = new Dough();
        sauce = new Sauce();
        toppings.add("Some cheese...");
    }

    @Override
    public void prepare() {
    }
}
