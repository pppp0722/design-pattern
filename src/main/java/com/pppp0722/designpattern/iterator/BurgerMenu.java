package com.pppp0722.designpattern.iterator;

public class BurgerMenu implements Menu {

    public static final int MAX_ITEMS = 3;
    private int numOfItems = 0;
    private MenuItem[] menuItems;

    public BurgerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    @Override
    public void addItem(MenuItem menuItem) {
        if (numOfItems >= MAX_ITEMS) {
            System.out.println("메뉴가 꽉 찼습니다.");
        } else {
            menuItems[numOfItems++] = menuItem;
        }
    }

    @Override
    public Iterator iterator() {
        return new BurgerMenuIterator(menuItems);
    }
}
