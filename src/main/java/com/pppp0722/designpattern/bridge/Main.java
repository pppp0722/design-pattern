package com.pppp0722.designpattern.bridge;

public class Main {

    public static void main(String[] args) {
        Food sweatPizza = new Pizza(new Sweat());
        Food sourPizza = new Pizza(new Sour());
        Chicken sweatChicken = new Chicken(new Sweat());
        Chicken sourChicken = new Chicken(new Sour());

        System.out.println(sweatPizza.getFoodInfo());
        System.out.println(sourPizza.getFoodInfo());
        System.out.println(sweatChicken.getFoodInfo());
        System.out.println(sourChicken.getFoodInfo());
    }
}
