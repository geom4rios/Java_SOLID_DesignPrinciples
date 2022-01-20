package com.geom4rios.cleancode.designPrinciples.Command;
import com.geom4rios.cleancode.designPrinciples.Command.commands.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
