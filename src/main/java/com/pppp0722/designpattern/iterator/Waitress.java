package com.pppp0722.designpattern.iterator;

public class Waitress {

    Menu burgerMenu;
    Menu cafeMenu;

    public Waitress(Menu burgerMenu, Menu cafeMenu) {
        this.burgerMenu = burgerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator burgerIterator = burgerMenu.iterator();
        Iterator cafeIterator = cafeMenu.iterator();
        System.out.println("--버거 메뉴--");
        printMenu(burgerIterator);
        System.out.println("--카페 메뉴--");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " | " + menuItem.getCost() + " | "
                + menuItem.getDescription());
        }
    }
}
