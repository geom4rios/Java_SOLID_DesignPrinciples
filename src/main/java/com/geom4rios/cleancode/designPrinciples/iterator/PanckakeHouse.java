package com.geom4rios.cleancode.designPrinciples.iterator;

import com.geom4rios.cleancode.designPrinciples.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PanckakeHouse {
    ArrayList<MenuItem> menuItems;

    public PanckakeHouse() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B pancake brekfast", "breakfast with pancakes", true, 2.99);
        addItem("Bluberry panckage", "breakfast with bluberry pancakes", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
