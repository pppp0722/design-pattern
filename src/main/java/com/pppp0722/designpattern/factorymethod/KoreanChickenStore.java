package com.pppp0722.designpattern.factorymethod;

public class KoreanChickenStore extends ChickenStore {

    @Override
    protected Chicken create(ChickenType chickenType) {
        Chicken chicken;
        switch (chickenType) {
            case FRIED:
                chicken = new KoreanStyleFriedChicken();
                break;
            case SEASONED:
                chicken = new KoreanStyleSeasonedChicken();
                break;
            default:
                throw new RuntimeException("invalid chicken type!");
        }

        return chicken;
    }
}
