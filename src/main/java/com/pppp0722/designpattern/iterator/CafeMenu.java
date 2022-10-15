package com.pppp0722.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class CafeMenu implements Menu {

    private List<MenuItem> items;

    public CafeMenu() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(MenuItem menuItem) {
        items.add(menuItem);
    }

    @Override
    public Iterator iterator() {
        return new CafeMenuIterator(items);
    }
}
