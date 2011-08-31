package com.coffeemachine.designpattern.factory;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/27/11
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new Mozzarella();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new EggPlant(), new BlackOlives(), new Spinach() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clam createClams() {
        return new FrozenClam();
    }
}
