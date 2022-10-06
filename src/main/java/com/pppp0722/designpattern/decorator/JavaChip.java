package com.pppp0722.designpattern.decorator;

public class JavaChip extends CondimentDecorator {

    public JavaChip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 자바칩";
    }

    @Override
    public int getPrice() {
        return beverage.getPrice() + 500;
    }
}
