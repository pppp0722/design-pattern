package com.pppp0722.designpattern.abstractfactory;

public class MeDeveloperFactory implements DeveloperFactory {

    @Override
    public Language createLanguage() {
        return new Java();
    }

    @Override
    public Field createField() {
        return new Backend();
    }
}
