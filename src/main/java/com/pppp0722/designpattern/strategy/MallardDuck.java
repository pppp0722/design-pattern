package com.pppp0722.designpattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 청둥오리입니다.");
    }
}
