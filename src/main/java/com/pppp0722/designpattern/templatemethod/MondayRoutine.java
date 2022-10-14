package com.pppp0722.designpattern.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MondayRoutine extends Routine {

    @Override
    void study() {
        System.out.println("월요일은 역시 Java 공부지!");
    }

    @Override
    void play() {
        System.out.println("주말에 실컷 놀았으니 유튜브 조금만 보다 자자.");
    }

    @Override
    boolean sleepy() {
        String answer = getUserInput();
        boolean ret;

        switch (answer) {
            case "y":
                ret = true;
                break;
            case "error":
                System.out.println("error");
                ret = false;
                break;
            default:
                ret = false;
                break;
        }

        return ret;
    }

    private String getUserInput() {
        System.out.print("공부하느라 피곤한가요? (y / 나머지) : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            return "error";
        }
    }
}
