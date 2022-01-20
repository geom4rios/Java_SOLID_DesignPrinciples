package com.geom4rios.cleancode.designPrinciples.Factory.pizzaStore;

import com.geom4rios.cleancode.designPrinciples.Factory.pizza.NYStyleCheesePizza;
import com.geom4rios.cleancode.designPrinciples.Factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type == "cheese") {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
