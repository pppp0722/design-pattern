package com.pppp0722.designpattern.singleton;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println( name + ": " + "멍!" );
    }
}