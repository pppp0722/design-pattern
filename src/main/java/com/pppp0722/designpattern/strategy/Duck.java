package com.pppp0722.designpattern.strategy;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("모든 오리는 수영할 수 있습니다.");
    }

    public abstract void display();
}
