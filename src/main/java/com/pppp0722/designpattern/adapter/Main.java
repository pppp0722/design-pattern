package com.pppp0722.designpattern.adapter;

public class Main {

    public static void main(String[] args) {
        Cat koreanShortHairCat = new KoreanShortHairCat();
        Cat malteseDog = new DogAdapter(new MalteseDog());

        koreanShortHairCat.meow();
        malteseDog.meow();
    }
}
