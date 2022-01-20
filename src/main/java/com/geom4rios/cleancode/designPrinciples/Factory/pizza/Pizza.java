package com.geom4rios.cleancode.designPrinciples.Factory.pizza;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare () {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce...");

        for (String topping: toppings) {
            System.out.println("Adding " + topping);
        }
    }

    public void baked () {
        System.out.println("Baking");
    }

    public void cooked () {
        System.out.println("Cooking");
    }

    public void packaged () {
        System.out.println("Packaging");
    }

    public void delivered() {
        System.out.println("Delivering");
    }
}

