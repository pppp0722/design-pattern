package com.pppp0722.designpattern.decorator;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();
}
