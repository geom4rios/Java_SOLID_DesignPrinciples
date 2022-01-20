package com.geom4rios.cleancode.designPrinciples.SimpleFactory.pizza;

public abstract class Pizza {
    public void prepare() {
        System.out.println("Pizza Prepared");
    }

    public void packaged() {
        System.out.println("Pizza packaged");
    }

    public void baked() {
        System.out.println("Pizza baked");
    }

    public void delivered () {
        System.out.println("Pizza Delivered");
    }
}

