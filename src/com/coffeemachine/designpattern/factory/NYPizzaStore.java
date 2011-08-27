package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return new NYStyleCheesePizza();
        }
    }

}
