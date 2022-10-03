package com.pppp0722.designpattern.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
