package com.pppp0722.designpattern.bridge;

public class Chicken extends Food {

    protected Chicken(Taste taste) {
        super(taste);
    }

    @Override
    public String getFoodInfo() {
        return taste.getTaste() + " " + "치킨";
    }
}