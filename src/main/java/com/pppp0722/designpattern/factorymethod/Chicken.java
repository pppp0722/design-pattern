package com.pppp0722.designpattern.factorymethod;

public abstract class Chicken {

    protected String name;

    protected String sauce;

    public String getName() {
        return name;
    }

    public String getSauce() {
        return sauce;
    }

    public void cook() {
        System.out.println("조리 중...");
    }

    public void box() {
        System.out.println("포장 중...");
    }
}
