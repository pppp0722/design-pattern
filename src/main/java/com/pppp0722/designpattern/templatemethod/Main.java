package com.pppp0722.designpattern.templatemethod;

public class Main {

    public static void main(String[] args) {
        MondayRoutine mondayRoutine = new MondayRoutine();
        TuesdayRoutine tuesdayRoutine = new TuesdayRoutine();

        mondayRoutine.carryOut();
        System.out.println();
        tuesdayRoutine.carryOut();
    }
}
