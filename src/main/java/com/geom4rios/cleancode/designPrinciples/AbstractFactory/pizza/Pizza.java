package com.geom4rios.cleancode.designPrinciples.AbstractFactory.pizza;

import com.geom4rios.cleancode.designPrinciples.AbstractFactory.cheese.Cheese;
import com.geom4rios.cleancode.designPrinciples.AbstractFactory.sauce.Sauce;

public abstract class Pizza {
    String name;
    Cheese cheese;
    Sauce sauce;


    abstract void prepare();

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

