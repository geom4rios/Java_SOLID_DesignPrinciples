package com.geom4rios.cleancode.designPrinciples.iterator;

import java.util.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS=6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Diner food 1", "A Diner food", true, 4.44);
        addItem("Diner food 2", "A second diner food", false, 5.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry reached maximum number of items in the diner menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            ++numberOfItems;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
