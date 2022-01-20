package com.geom4rios.cleancode.designPrinciples.Command.commands;

import com.geom4rios.cleancode.designPrinciples.Command.Stereo;

/*******************************************/

public class StereoOff implements Command {
    Stereo stereo;

    public StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.Off();
    }

    public void undo() {
        stereo.OnForCD();
    }
}
