package com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza;

public class ChicagoPizza extends Pizza {
    @Override
    public void baked() {
        System.out.println("Chicago Pizza Baked");
    }
}
