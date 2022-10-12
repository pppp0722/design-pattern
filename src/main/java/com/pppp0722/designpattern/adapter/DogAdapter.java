package com.pppp0722.designpattern.adapter;

public class DogAdapter implements Cat {

    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void meow() {
        dog.bark();
    }
}
