package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizzaIngredient;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.Cheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.NYCheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.NYSauce;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredient {

    @Override
    public Cheese createCheese() {
        Cheese NewYorkCheese = new NYCheese();
        return NewYorkCheese;
    }

    @Override
    public Sauce createSauce() {
        Sauce NewYorkSauce = new NYSauce();
        return NewYorkSauce;
    }

}
