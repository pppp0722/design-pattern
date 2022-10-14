package com.pppp0722.designpattern.templatemethod;

public class TuesdayRoutine extends Routine {

    @Override
    void study() {
        System.out.println("화요일은 CS 공부 하는 날.");
    }

    @Override
    void play() {
        System.out.println("화요일이니 컴퓨터 게임을 해볼까~");
    }
}
