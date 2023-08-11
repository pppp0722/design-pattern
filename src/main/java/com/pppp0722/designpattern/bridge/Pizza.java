package com.pppp0722.designpattern.bridge;

public class Pizza extends Food {

    protected Pizza(Taste taste) {
        super(taste);
    }

    @Override
    public String getFoodInfo() {
        return taste.getTaste() + " " + "피자";
    }
}
