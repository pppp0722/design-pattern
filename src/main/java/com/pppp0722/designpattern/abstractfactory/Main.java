package com.pppp0722.designpattern.abstractfactory;

public class Main {

    public static void main(String[] args) {
        FactoryOfDeveloperFactory factoryOfDeveloperFactory = new FactoryOfDeveloperFactory();
        factoryOfDeveloperFactory.getAJob("me");
        System.out.println();
        factoryOfDeveloperFactory.getAJob("django");
    }
}
