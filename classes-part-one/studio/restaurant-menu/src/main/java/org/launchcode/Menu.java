package org.launchcode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Menu(Date dateUpdated, ArrayList<MenuItem> menu) {
        this.dateUpdated = dateUpdated;
        this.menu = menu;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
}
