package com.pppp0722.designpattern.iterator;

import java.util.List;

public class CafeMenuIterator implements Iterator {

    List<MenuItem> items;
    int pos = 0;

    public CafeMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new RuntimeException("no more item");
        }
        return items.get(pos++);
    }

    @Override
    public boolean hasNext() {
        return pos < items.size();
    }
}
