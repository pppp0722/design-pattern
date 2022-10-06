package com.pppp0722.designpattern.decorator;

public abstract class Beverage {

    protected String description = "이름 없음";

    public String getDescription() {
        return description;
    }

    public abstract int getPrice();
}
