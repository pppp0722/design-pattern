package com.pppp0722.designpattern.factorymethod;

public abstract class ChickenStore {

    public Chicken order(ChickenType chickenType) {
        Chicken chicken = create(chickenType);
        chicken.cook();
        chicken.box();

        return chicken;
    }

    protected abstract Chicken create(ChickenType chickenType);
}
