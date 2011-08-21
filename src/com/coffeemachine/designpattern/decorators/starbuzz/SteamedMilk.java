package com.coffeemachine.designpattern.decorators.starbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SteamedMilk extends CondimentDecorator {
    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
