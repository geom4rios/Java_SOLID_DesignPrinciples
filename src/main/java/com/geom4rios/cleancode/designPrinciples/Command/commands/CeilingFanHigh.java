package com.geom4rios.cleancode.designPrinciples.Command.commands;

import com.geom4rios.cleancode.designPrinciples.Command.CeilingFan;

/*******************************************/

public class CeilingFanHigh implements Command {
    CeilingFan ceilingFan;

    public CeilingFanHigh(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.High();
    }

    public void undo() {
        ceilingFan.Off();
    }
}
