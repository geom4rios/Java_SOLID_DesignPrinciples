package com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza;

public class NewYorkPizza extends Pizza {
    @Override
    public void baked() {
        System.out.println("New York Pizza Baked");
    }
}
