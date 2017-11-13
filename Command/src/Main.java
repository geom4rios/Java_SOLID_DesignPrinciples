public class Main {
    public static void main (String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light KitchenLight = new Light("Kitchen Light");
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(KitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(KitchenLight);

        StereoOnForCD stereoOn = new StereoOnForCD(stereo);
        StereoOff stereoOff = new StereoOff(stereo);

        CeilingFanHigh ceilingFanHigh = new CeilingFanHigh(ceilingFan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceilingFan);

        GarageDoorOpen garageDoorOpen = new GarageDoorOpen(garageDoor);
        GarageDoorClose garageDoorClose = new GarageDoorClose(garageDoor);

        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, ceilingFanHigh, stereoOn};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff, ceilingFanOff, stereoOff};

        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOn, stereoOff);
        remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(4, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.undoButtonWasPressed();
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);

        remoteControl.onButtonWasPressed(5);
        remoteControl.offButtonWasPressed(5);

    }
}
