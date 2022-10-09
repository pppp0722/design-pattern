package com.pppp0722.designpattern.abstractfactory;

public class DjangoDeveloperFactory implements DeveloperFactory {

    @Override
    public Language createLanguage() {
        return new Python();
    }

    @Override
    public Field createField() {
        return new Backend();
    }
}
