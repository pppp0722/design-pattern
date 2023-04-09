package com.pppp0722.designpattern.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        StringValidator stringValidator = new StringValidator("abcde");
        stringValidator.execute();

        stringValidator = new StringValidator("abc");
        stringValidator.execute();

        stringValidator = new StringValidator("bbcde");
        stringValidator.execute();
    }
}
