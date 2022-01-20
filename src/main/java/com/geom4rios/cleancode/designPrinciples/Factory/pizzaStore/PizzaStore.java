package com.geom4rios.cleancode.designPrinciples.Factory.pizzaStore;

import com.geom4rios.cleancode.designPrinciples.Factory.pizza.Pizza;

public abstract class PizzaStore {

    public void orderPizza(String type) {
        Pizza aPizza = createPizza(type);

        aPizza.prepare();
        aPizza.baked();
        aPizza.cooked();
        aPizza.packaged();
        aPizza.delivered();

    }

    public abstract Pizza createPizza(String type);
}


