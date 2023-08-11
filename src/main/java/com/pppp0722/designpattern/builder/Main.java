package com.pppp0722.designpattern.builder;

public class Main {

    public static void main(String[] args) {
        Student student = Student.builder()
                .id("16011209")
                .name("Ilhwan Lee")
                .age(28)
                .build();

        System.out.println(student);
    }
}
