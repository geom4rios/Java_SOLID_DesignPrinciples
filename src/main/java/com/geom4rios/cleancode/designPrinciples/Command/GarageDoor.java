package com.geom4rios.cleancode.designPrinciples.Command;

public class GarageDoor {
    public void up() {
        System.out.println("Garage is up");
    }

    public void down() {
        System.out.println("Garage is down");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }

    public void stop () {
        System.out.println("Garage has stopped");
    }

}
