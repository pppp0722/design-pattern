package com.pppp0722.designpattern.proxy;

public class HelloService implements Service {

    @Override
    public void doSomething() {
        System.out.println("Hello!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
