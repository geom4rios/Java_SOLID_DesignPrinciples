package com.geom4rios.cleancode.designPrinciples.Command.commands;

import com.geom4rios.cleancode.designPrinciples.Command.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
