package com.pppp0722.designpattern.strategy;

public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("로켓을 타고 날아다녀요.");
    }
}
