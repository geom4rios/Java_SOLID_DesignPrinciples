package com.geom4rios.cleancode.designPrinciples.Factory.pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "New York Style cheese Pizza";
        dough = "New York Dough";
        sauce = "New York Sauce";

        toppings.add("Grated regianno cheese");
    }
}
