package com.pppp0722.designpattern.templatemethod;

public abstract class Routine {

    final void carryOut() {
        wakeUp();
        study();
        if (!sleepy()) {
            play();
        }
    }

    void wakeUp() {
        System.out.println("기상");
    }

    abstract void study();

    abstract void play();

    boolean sleepy() {
        return false;
    }
}
