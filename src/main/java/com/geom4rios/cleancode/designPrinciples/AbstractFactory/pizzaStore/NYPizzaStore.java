package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaStore;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza.CheesePizza;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza.ClamPizza;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza.Pizza;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient.NYPizzaIngredientFactory;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient.PizzaIngredient;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredient factory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("New York Clam Pizza");
        }
        return pizza;
    }
}
