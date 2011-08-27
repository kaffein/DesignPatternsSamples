package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
