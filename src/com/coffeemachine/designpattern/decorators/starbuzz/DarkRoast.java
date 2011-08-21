package com.coffeemachine.designpattern.decorators.starbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
