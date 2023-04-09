package com.pppp0722.designpattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChainValidator<T> {

    private final T objectToValidate;
    private final List<Validator<T>> validators = new ArrayList<>();
    private final List<Runnable> actionsOnError = new ArrayList<>();

    public ChainValidator(T objectToValidate) {
        this.objectToValidate = objectToValidate;
    }

    public ChainValidator<T> next(Validator<T> validator, Runnable actionOnError) {
        validators.add(validator);
        actionsOnError.add(actionOnError);
        return this;
    }

    public void execute() {
        for (int i = 0; i < validators.size(); i++) {
            if (!validators.get(i).validate(objectToValidate)) {
                actionsOnError.get(i).run();
                break;
            }
        }
    }
}