package com.geom4rios.cleancode.designPrinciples.Command;

import com.geom4rios.cleancode.designPrinciples.Command.commands.Command;
import com.geom4rios.cleancode.designPrinciples.Command.commands.NoCommand;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl () {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n ------------Remote Control------------\n");
        for (int i=0; i<onCommands.length; i++) {
            stringBuff.append("[Slot " + i + "] " + onCommands[i].getClass().getName()
            + " " + offCommands[i].getClass().getName() + "\n"
            );
        }

        return stringBuff.toString();
    }
}
