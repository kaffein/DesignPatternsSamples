package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago style veggie pizza";
        dough = new Dough();
        sauce = new Sauce();
        toppings.add("No more cheese...ieuurkk!!!");
    }

    @Override
    public void prepare() {
    }
}
