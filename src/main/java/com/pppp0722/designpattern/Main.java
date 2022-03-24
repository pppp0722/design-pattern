package com.pppp0722.designpattern;

import com.pppp0722.designpattern.singleton.Dog;
import com.pppp0722.designpattern.singleton.SingleDog;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");

        dog1.bark();
        dog2.bark();

        if (dog1.equals(dog2)) {
            System.out.println( "dog1 & dog2 => 같습니다." );
        } else {
            System.out.println("dog1 & dog2 => 다릅니다.");
        }

        SingleDog singleDog1 = SingleDog.getInstance();
        SingleDog singleDog2 = SingleDog.getInstance();

        singleDog1.changeName("singleDog1");
        singleDog2.changeName("singleDog2");

        singleDog1.bark();
        singleDog2.bark();

        if (singleDog1.equals(singleDog2)) {
            System.out.println("singleDog1 & singleDog2 => 같습니다.");
        } else {
            System.out.println("singleDog1 & singleDog2 => 다릅니다.");
        }
    }
}