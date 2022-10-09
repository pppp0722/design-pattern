package com.pppp0722.designpattern.factorymethod;

public class AmericanChickenStore extends ChickenStore {

    @Override
    protected Chicken create(ChickenType chickenType) {
        Chicken chicken;
        switch (chickenType) {
            case FRIED:
                chicken = new AmericanStyleFriedChicken();
                break;
            case SEASONED:
                chicken = new AmericanStyleSeasonedChicken();
                break;
            default:
                throw new RuntimeException("invalid chicken type!");
        }

        return chicken;
    }
}
