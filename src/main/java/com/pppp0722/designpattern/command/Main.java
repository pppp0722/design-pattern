package com.pppp0722.designpattern.command;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Fan fan = new Fan();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command fanLowCommand = new FanLowCommand(fan);
        Command fanHighCommand = new FanHighCommand(fan);
        Command fanOffCommand = new FanOffCommand(fan);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, fanLowCommand, fanOffCommand);
        remoteControl.setCommand(2, fanHighCommand, fanOffCommand);

        remoteControl.onBtnPressed(0);
        remoteControl.undoBtnPressed();
        remoteControl.onBtnPressed(1);
        remoteControl.onBtnPressed(2);
        remoteControl.undoBtnPressed();
        remoteControl.offBtnPressed(1);
    }
}
