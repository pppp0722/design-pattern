package com.pppp0722.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Menu implements Cloneable {

    private final List<String> items;

    public Menu() {
        items = new ArrayList<>();
        loadData();
    }

    private Menu(List<String> items) {
        this.items = items;
    }

    private void loadData() {
        // 실제로는 DB read 등 I/O 작업이 들어갈 것
        items.add("커피");
        items.add("콜라");
        items.add("라떼");
    }

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return String.join(", ", items);
    }

    @Override
    public Object clone() {
        List<String> replica = new ArrayList<>(items);
        return new Menu(replica);
    }
}
