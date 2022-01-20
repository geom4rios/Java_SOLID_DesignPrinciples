package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.Cheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.ChicagoCheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.NYCheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.ChicagoSauce;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.NYSauce;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.Sauce;

public interface PizzaIngredient {
    public Cheese createCheese();
    public Sauce createSauce();
}

