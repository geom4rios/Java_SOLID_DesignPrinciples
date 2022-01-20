package com.geom4rios.cleancode.designPrinciples.Command.commands;

public interface Command {
    public abstract void execute();

    public abstract void undo();
}

