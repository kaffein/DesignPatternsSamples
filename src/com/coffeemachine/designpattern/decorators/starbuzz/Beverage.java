package com.coffeemachine.designpattern.decorators.starbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 1:47 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Beverage {
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
