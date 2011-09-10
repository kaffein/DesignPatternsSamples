package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 1:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style deep dish cheese pizza";
        dough = new Dough();
        sauce = new Sauce();
        toppings.add("Shredded mozarella Cheese");
    }

    @Override
    public void prepare() {
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
