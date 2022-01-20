package com.geom4rios.cleancode.designPrinciples.Factory.pizzaStore;

import com.geom4rios.cleancode.designPrinciples.Factory.pizza.ChicagoStyleCheesePizza;
import com.geom4rios.cleancode.designPrinciples.Factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "cheese") {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}
