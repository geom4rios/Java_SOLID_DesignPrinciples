package com.geom4rios.cleancode.designPrinciples.Command.commands;


import com.geom4rios.cleancode.designPrinciples.Command.GarageDoor;

public class GarageDoorOpen implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpen(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
