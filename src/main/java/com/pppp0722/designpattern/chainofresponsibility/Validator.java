package com.pppp0722.designpattern.chainofresponsibility;

public interface Validator<T> {

    boolean validate(T objectToValidate);
}