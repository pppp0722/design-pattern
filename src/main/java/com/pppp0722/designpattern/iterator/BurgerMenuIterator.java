package com.pppp0722.designpattern.iterator;

public class BurgerMenuIterator implements Iterator {

    MenuItem[] items;
    int pos = 0;

    public BurgerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new RuntimeException("no more item");
        }
        return items[pos++];
    }

    @Override
    public boolean hasNext() {
        return pos < items.length && items[pos] != null;
    }
}
