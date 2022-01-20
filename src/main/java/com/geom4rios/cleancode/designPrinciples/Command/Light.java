package com.geom4rios.cleancode.designPrinciples.Command;

public class Light {
    String kind;

    public Light(String kind) {
        this.kind = kind;
    }

    public void on() {
        System.out.println("Light is on for " + kind);
    }

    public void off() {
        System.out.println("Light is off for " + kind);
    }
}


