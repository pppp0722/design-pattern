package com.pppp0722.designpattern.command;

public class Fan {

    public static final int HIGH = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    int speed;

    public Fan() {
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("선풍기 속도를 HIGH로 설정합니다.");
    }

    public void low() {
        speed = LOW;
        System.out.println("선풍기 속도를 LOW로 설정합니다.");
    }

    public void off() {
        speed = OFF;
        System.out.println("선풍기를 끕니다.");
    }

    public int getSpeed() {
        return speed;
    }
}