package com.pppp0722.designpattern.iterator;

public class Main {

    public static void main(String[] args) {
        Menu burgerMenu = new BurgerMenu();
        Menu cafeMenu = new CafeMenu();
        burgerMenu.addItem(new MenuItem("새우 버거", 3000, "새우가 들어간 버거"));
        burgerMenu.addItem(new MenuItem("불고기 버거", 4000, "한국인의 국민 버거"));
        cafeMenu.addItem(new MenuItem("아메리카노", 4000, "물처럼 마시는 커피"));
        cafeMenu.addItem(new MenuItem("라떼", 5000, "라떼는 말이야"));
        Waitress waitress = new Waitress(burgerMenu, cafeMenu);
        waitress.printMenu();
    }
}
