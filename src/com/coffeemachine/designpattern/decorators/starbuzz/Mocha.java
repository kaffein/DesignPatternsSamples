package com.coffeemachine.designpattern.decorators.starbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
