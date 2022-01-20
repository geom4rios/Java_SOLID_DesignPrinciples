package com.geom4rios.cleancode.designPrinciples.Factory;

import com.geom4rios.cleancode.designPrinciples.Factory.pizzaStore.ChicagoPizzaStore;
import com.geom4rios.cleancode.designPrinciples.Factory.pizzaStore.NYPizzaStore;

public class Main {

    public static void main (String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");
        chicagoStore.orderPizza("cheese");
    }

}
