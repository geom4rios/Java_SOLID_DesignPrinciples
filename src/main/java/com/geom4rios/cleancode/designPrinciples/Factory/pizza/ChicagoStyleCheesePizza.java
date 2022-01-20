package com.geom4rios.cleancode.designPrinciples.Factory.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style cheese Pizza";
        dough = "Chicago Dough";
        sauce = "Chicago Sauce";

        toppings.add("Grated regianno chicago cheese");
    }
}
