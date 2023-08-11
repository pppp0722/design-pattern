package com.pppp0722.designpattern.prototype;

public class Main {

    public static void main(String[] args) {
        Menu originalMenu = new Menu();

        Menu replicaMenu1 = (Menu) originalMenu.clone();
        Menu replicaMenu2 = (Menu) originalMenu.clone();

        replicaMenu1.addItem("에이드");
        replicaMenu2.addItem("프라푸치노");

        System.out.println(replicaMenu1);
        System.out.println("---");
        System.out.println(replicaMenu2);
    }
}
