package com.pppp0722.designpattern.facade;

public class BreakfastFacade {

    private ToastMachine toastMachine;
    private Refrigerator refrigerator;

    public BreakfastFacade(ToastMachine toastMachine, Refrigerator refrigerator) {
        this.toastMachine = toastMachine;
        this.refrigerator = refrigerator;
    }

    public void prepareMeal() {
        toastMachine.turnOn();
        refrigerator.open();
        refrigerator.close();
        toastMachine.turnOff();
    }
}
