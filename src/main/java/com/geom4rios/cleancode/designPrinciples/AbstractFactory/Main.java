package com.geom4rios.cleancode.designPrinciples.AbstractFactory;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza.Pizza;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaStore.ChicagoPizzaStore;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaStore.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        ChicagoPizzaStore chStore = new ChicagoPizzaStore();
        NYPizzaStore nyStore = new NYPizzaStore();

        Pizza chCheesePizza = chStore.createPizza("cheese");

        Pizza nyClamPizza = nyStore.createPizza("clam");

    }
}
