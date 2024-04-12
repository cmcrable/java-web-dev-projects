package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem pbj = new MenuItem(5.99, "Peanut Butter & Jelly Sandwich", "sandwich", true);
        MenuItem milkshake = new MenuItem(3.15, "Vanilla Milkshake", "dessert", false);
        MenuItem reuben = new MenuItem(6.99, "Reuben Sandwich", "sandwich", true);
        MenuItem pancakes = new MenuItem(5.85, "Flapjacks", "breakfast", false);

        Date menuDate = new Date(4/11/2024);
        ArrayList<MenuItem> menu1 = new ArrayList<>();
        Menu newMenu = new Menu(menuDate,menu1);
        newMenu.addItems(pbj);
        newMenu.addItems(milkshake);
        newMenu.addItems(reuben);
        newMenu.addItems(pancakes);

        // for bonus
        newMenu.addItems(pbj);

        newMenu.printMenu();
    }
}
