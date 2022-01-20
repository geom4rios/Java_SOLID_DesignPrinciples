package com.geom4rios.cleancode.designPrinciples.Command.commands;

import com.geom4rios.cleancode.designPrinciples.Command.GarageDoor;

/*******************************************/

public class GarageDoorClose implements Command {
    GarageDoor garageDoor;

    public GarageDoorClose(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}
