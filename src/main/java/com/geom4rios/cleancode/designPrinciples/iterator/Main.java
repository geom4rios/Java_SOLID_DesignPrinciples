package com.geom4rios.cleancode.designPrinciples.iterator;

import com.geom4rios.cleancode.designPrinciples.iterator.DinerMenu;

public class Main {
    public static void main(String[] args) {
        PanckakeHouse panckakeHouse = new PanckakeHouse();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(panckakeHouse, dinerMenu);

        waitress.printMenu();
    }
}
