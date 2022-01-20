package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.Cheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.ChicagoCheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.ChicagoSauce;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredient {

    @Override
    public Cheese createCheese() {
        Cheese chicagoCheese = new ChicagoCheese();
        return chicagoCheese;
    }

    @Override
    public Sauce createSauce() {
        Sauce chicagoSauce = new ChicagoSauce();
        return chicagoSauce;
    }

}
