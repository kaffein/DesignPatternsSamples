package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a : " + pizza.getName());

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
