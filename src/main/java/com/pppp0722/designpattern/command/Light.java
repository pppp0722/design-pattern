package com.pppp0722.designpattern.command;

public class Light {

    boolean isTurnedOn;

    public Light() {
        isTurnedOn = false;
    }

    public void on() {
        isTurnedOn = true;
        System.out.println("불을 켭니다.");
    }

    public void off() {
        isTurnedOn = false;
        System.out.println("불을 끕니다.");
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
