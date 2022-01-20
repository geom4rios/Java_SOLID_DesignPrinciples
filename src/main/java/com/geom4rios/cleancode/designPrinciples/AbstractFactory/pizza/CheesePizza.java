package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient.PizzaIngredient;

public class CheesePizza extends Pizza {

    PizzaIngredient ingredientFactory;

    public CheesePizza(PizzaIngredient pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    void prepare() {
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }

}
