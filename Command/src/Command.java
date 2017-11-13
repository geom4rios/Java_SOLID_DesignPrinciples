public interface Command {
    public abstract void execute();
    public abstract void undo();
}

class NoCommand implements Command {
    public void execute () {}
    public void undo () {}
}

class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute () {
        light.on();
    }

    public void undo () {
        light.off();
    }
}

/********************************************/

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute () {
        light.off();
    }

    public void undo () {
        light.on();
    }
}

/********************************************/

class GarageDoorOpen implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpen (GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo () {
        garageDoor.down();
    }
}

/*******************************************/

class GarageDoorClose implements Command {
    GarageDoor garageDoor;

    public GarageDoorClose (GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}

/*******************************************/

class CeilingFanHigh implements Command {
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

/*******************************************/

class CeilingFanOff implements Command {
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

/*******************************************/

class StereoOff implements Command {
    Stereo stereo;

    public StereoOff(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute () {
        stereo.Off();
    }

    public void undo() {
        stereo.OnForCD();
    }
}

/*******************************************/

class StereoOnForCD implements Command {
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

class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute () {
        for(int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo () {
        for(int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}