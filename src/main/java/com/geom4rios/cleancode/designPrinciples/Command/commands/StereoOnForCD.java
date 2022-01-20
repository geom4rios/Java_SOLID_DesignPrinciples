package com.geom4rios.cleancode.designPrinciples.Command.commands;

import com.geom4rios.cleancode.designPrinciples.Command.Stereo;

public class StereoOnForCD implements Command {
    Stereo stereo;

    public StereoOnForCD(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute () {
        stereo.OnForCD();
    }

    public void undo () {
        stereo.Off();
    }
}
