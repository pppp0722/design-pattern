package com.pppp0722.designpattern.decorator;

public class Americano extends Beverage{

    public Americano() {
        this.description = "아메리카노";
    }

    @Override
    public int getPrice() {
        return 5000;
    }
}
