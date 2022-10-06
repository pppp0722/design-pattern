package com.pppp0722.designpattern.decorator;

public class Frappuccino extends Beverage {

    public Frappuccino() {
        this.description = "프라푸치노";
    }

    @Override
    public int getPrice() {
        return 6000;
    }
}
