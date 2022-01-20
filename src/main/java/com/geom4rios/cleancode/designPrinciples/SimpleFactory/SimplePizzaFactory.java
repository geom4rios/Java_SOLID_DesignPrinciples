package com.geom4rios.cleancode.designPrinciples.SimpleFactory;

import com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza.ChicagoPizza;
import com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza.NewYorkPizza;
import com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza aPizza = null;

        if (type == "Chicago") {
            aPizza = new ChicagoPizza();
        } else if (type == "New York") {
            aPizza = new NewYorkPizza();
        }

        return aPizza;

    }
}
