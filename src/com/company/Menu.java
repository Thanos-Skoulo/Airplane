package com.company;

import java.util.ArrayList;

public class Menu {

    private int menuId;
    private ArrayList<String> plates;
    private ArrayList<String> desserts;
    private ArrayList<String> drinks;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public ArrayList<String> getPlates() {
        return plates;
    }

    public void setPlates(ArrayList<String> plates) {
        this.plates = plates;
    }

    public ArrayList<String> getDesserts() {
        return desserts;
    }

    public void setDesserts(ArrayList<String> desserts) {
        this.desserts = desserts;
    }

    public ArrayList<String> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<String> drinks) {
        this.drinks = drinks;
    }
}
