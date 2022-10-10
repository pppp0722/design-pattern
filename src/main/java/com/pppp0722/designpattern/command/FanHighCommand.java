package com.pppp0722.designpattern.command;

import static com.pppp0722.designpattern.command.Fan.HIGH;
import static com.pppp0722.designpattern.command.Fan.LOW;
import static com.pppp0722.designpattern.command.Fan.OFF;

public class FanHighCommand implements Command {


    Fan fan;
    int prevSpeed;

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH:
                fan.high();
                break;
            case LOW:
                fan.low();
                break;
            case OFF:
                fan.off();
                break;
            default:
                throw new RuntimeException("invalid fan speed type!");
        }
    }
}
