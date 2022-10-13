package com.pppp0722.designpattern.facade;

public class Main {

    public static void main(String[] args) {
        System.out.println("--퍼사드 패턴 X--");
        ToastMachine toastMachine = new ToastMachine();
        Refrigerator refrigerator = new Refrigerator();
        toastMachine.turnOn();
        refrigerator.open();
        refrigerator.close();
        toastMachine.turnOff();

        System.out.println("--퍼사드 패턴 O--");
        BreakfastFacade breakfastFacade = new BreakfastFacade(toastMachine, refrigerator);
        breakfastFacade.prepareMeal();
    }
}
