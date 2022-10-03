package com.pppp0722.designpattern.strategy;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날개로 날고 있습니다.");
    }
}
