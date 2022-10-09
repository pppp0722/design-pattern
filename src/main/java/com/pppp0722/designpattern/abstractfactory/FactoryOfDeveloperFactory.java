package com.pppp0722.designpattern.abstractfactory;

public class FactoryOfDeveloperFactory {

    public void getAJob(String type) {
        DeveloperFactory developerFactory;
        switch (type) {
            case "me":
                developerFactory = new MeDeveloperFactory();
                break;
            case "django":
                developerFactory = new DjangoDeveloperFactory();
                break;
            default:
                throw new RuntimeException("invalid type!");
        }

        developerFactory.createLanguage();
        developerFactory.createField();
        System.out.println("개발자 생성 완료!");
    }
}
