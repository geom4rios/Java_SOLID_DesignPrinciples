package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaStore;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza.Pizza;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient.ChicagoPizzaIngredientFactory;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient.NYPizzaIngredientFactory;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient.PizzaIngredient;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public void prepare() {
        System.out.println("Pizza prepared");
    }

    public void cooked() {
        System.out.println("Pizza Cooked");
    }

    public void baked() {
        System.out.println("Pizza Baked");
    }

    public void packaged() {
        System.out.println("Pizza packaged");
    }

    public void delivered() {
        System.out.println("Pizza delivered");
    }
}

