package com.coffeemachine.designpattern.decorators.starbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ", $" + espresso.cost());

        // Dark roast with double mocha
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + ", $" + darkRoast.cost());

        // Houseblend with soy, whip and mocha
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription() + ", $" + houseBlend.cost());

    }
}
