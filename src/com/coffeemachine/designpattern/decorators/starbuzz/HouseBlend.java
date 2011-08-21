package com.coffeemachine.designpattern.decorators.starbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/21/11
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
