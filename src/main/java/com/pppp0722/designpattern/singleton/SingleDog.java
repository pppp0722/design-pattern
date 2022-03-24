package com.pppp0722.designpattern.singleton;

public class SingleDog {
    private static final SingleDog instance = new SingleDog();
    private static String name = "singleDog";

    private SingleDog() {}

    public static SingleDog getInstance() {
        return instance;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + ": " + "멍!");
    }
}