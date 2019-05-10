package com.company;

import java.util.ArrayList;

public class Menu {

    private int menuId;
    private ArrayList<String> mainDish;
    private ArrayList<String> desserts;
    private ArrayList<String> drinks;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public ArrayList<String> getMainDish() {
        return mainDish;
    }

    public void setMainDish(ArrayList<String> mainDish) {
        this.mainDish = mainDish;
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

    public Menu(int menuId) {
        this.menuId = menuId;
        this.mainDish = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.desserts = new ArrayList<>();

    }
}
