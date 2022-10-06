package com.pppp0722.designpattern.decorator;

public class Main {

    public static void main(String[] args) {
        Beverage beverage1 = new Americano();
        System.out.println(beverage1.getDescription() + " : " + beverage1.getPrice());
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " : " + beverage1.getPrice());

        Beverage beverage2 = new JavaChip(new Mocha(new Frappuccino()));
        System.out.println(beverage2.getDescription() + " : " + beverage2.getPrice());
    }
}
