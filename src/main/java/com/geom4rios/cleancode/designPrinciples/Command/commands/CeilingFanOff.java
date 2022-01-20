package com.geom4rios.cleancode.designPrinciples.Command.commands;

import com.geom4rios.cleancode.designPrinciples.Command.CeilingFan;

public class CeilingFanOff implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.Off();
    }

    public void undo() {
        ceilingFan.High();
    }
}
