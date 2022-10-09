package com.pppp0722.designpattern.factorymethod;

import static com.pppp0722.designpattern.factorymethod.ChickenType.FRIED;
import static com.pppp0722.designpattern.factorymethod.ChickenType.SEASONED;

public class Main {

    public static void main(String[] args) {
        ChickenStore koreanStore = new KoreanChickenStore();
        ChickenStore americanStore = new AmericanChickenStore();

        Chicken koreanFriedChicken = koreanStore.create(FRIED);
        output(koreanFriedChicken.getName(), koreanFriedChicken.getSauce());
        Chicken koreanSeasonedChicken = koreanStore.create(SEASONED);
        output(koreanSeasonedChicken.getName(), koreanSeasonedChicken.getSauce());

        Chicken americanFriedChicken = americanStore.create(FRIED);
        output(americanFriedChicken.getName(), americanFriedChicken.getSauce());
        Chicken americanSeasonedChicken = americanStore.create(SEASONED);
        output(americanSeasonedChicken.getName(), americanSeasonedChicken.getSauce());
    }

    public static void output(String name, String sauce) {
        System.out.println("주문하신 " + name + " 나왔습니다.");
        System.out.println("특징은 " + sauce + " 입니다.");
        System.out.println();
    }
}
