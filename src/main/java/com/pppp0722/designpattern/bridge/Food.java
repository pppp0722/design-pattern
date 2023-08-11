package com.pppp0722.designpattern.bridge;

public abstract class Food {

    protected final Taste taste;

    protected Food(Taste taste) {
        this.taste = taste;
    }

    public abstract String getFoodInfo();
}
