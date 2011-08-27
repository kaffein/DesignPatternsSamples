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
        dough = "Thick crust dough from Chicago";
        sauce = "Chicago veggie sauce";
        toppings.add("No more cheese...ieuurkk!!!");
    }
}
