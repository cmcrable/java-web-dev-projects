package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void addItems(MenuItem item) {
        if (getItems().contains(item)) {
            System.out.println("Item is already on the menu");
        }
        else {
            this.items.add(item);
        }
    }

    public void removeItems(MenuItem item) {
        this.items.remove(item);
    }

//    public void isNew(MenuItem item) {
//        return this.items.get(this.items.indexOf(item)).isNew;
//    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
        System.out.println(item.getCategory());
        System.out.println(item.getPrice());

    }

    public  void printMenu() {
        for (MenuItem item: items) {
            printItem(item);
        }
    }




    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}


