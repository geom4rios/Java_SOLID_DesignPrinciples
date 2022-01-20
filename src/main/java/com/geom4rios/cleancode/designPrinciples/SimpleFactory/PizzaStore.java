package com.geom4rios.cleancode.designPrinciples.SimpleFactory;

import com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory simpleFactory;

    PizzaStore(SimplePizzaFactory factory) {
        this.simpleFactory = factory;
    }

    public void orderPizza(String type) {
        Pizza aPizza;
        aPizza = simpleFactory.createPizza(type);
        aPizza.prepare();
        aPizza.baked();
        aPizza.packaged();
        aPizza.delivered();
    }

}
