package com.geom4rios.cleancode.designPrinciples.iterator;

import java.util.Iterator;

public class Waitress {
    DinerMenu dinerMenu;
    PanckakeHouse panckakeHouse;

    public Waitress(PanckakeHouse panckakeHouse, DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;
        this.panckakeHouse = panckakeHouse;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
        }
    }
}
