package com.company;


import java.util.ArrayList;
import java.util.Scanner;

class MenuManager {

    private static final int ADD = 1;


    private ArrayList<Menu> menus = new ArrayList<>();



    Menu create(int menuId) {
        Menu menu = new Menu(menuId);
        return menu;

    }


    boolean menuExists(int menuId) {
        boolean menuExists =false;
        for (Menu menu : menus) {
            if (menuId == menu.getMenuId()) {
                menuExists = true;
            }
        }
        return menuExists;
    }

    void addDishes(Menu menu, Scanner scanner) {

        System.out.println("Add as many main plates as you want");

        menu.getMainDish().add(scanner.next());

        System.out.println("to add another dish in this list press 1 else press 2 to stop");
        while (scanner.nextInt() == ADD) {
            String newDish = scanner.next();
            if (!menu.getMainDish().contains(newDish)) {
                menu.getMainDish().add(newDish);
            }
            System.out.println("to add another dish in this list press 1 else press 2 to stop");
        }
    }

    void addDesserts(Menu menu, Scanner scanner) {


        System.out.println("now add as many desserts aw you want");
        menu.getDesserts().add(scanner.next());
        System.out.println("to add another dessert in this list press 1 else press 2 to stop");
        while (scanner.nextInt() == ADD) {
            String newDessert = scanner.next();
            if (!menu.getDesserts().contains(newDessert)) {
                menu.getDesserts().add(newDessert);
            }
            System.out.println("to add another dessert in this list press 1 else press 2 to stop");
        }

    }

    void addDrinks(Menu menu, Scanner scanner) {

        System.out.println("now it's time to add some drinks");
        menu.getDrinks().add(scanner.next());
        System.out.println("to add another drink in this list press 1 else press 2 to stop");

        while (scanner.nextInt() == ADD) {
            String newDrink = scanner.next();
            if (!menu.getDrinks().contains(newDrink)) {
                menu.getDrinks().add(newDrink);
            }
            System.out.println("to add another drink in this list press 1 else press 2 to stop");
        }

    }

    void addMenu(Menu menu) {
        menus.add(menu);
    }


    void printMenus() {
        for(Menu menu: menus){
            System.out.println(menu.toString());
        }
    }

    String selectDish(int menuSelected, Scanner scanner) {
        System.out.println(menus.get(menuSelected-1).getMainDish().toString());
        System.out.println("choose a main dish from the list above");

        return menus.get(menuSelected-1).getMainDish().get(scanner.nextInt()-1);
    }

    String selectDessert(int menuSelected, Scanner scanner){
        System.out.println(menus.get(menuSelected-1).getDesserts().toString());
        System.out.println("choose a main dish from the list above");
        return menus.get(menuSelected-1).getDesserts().get(scanner.nextInt()-1);

    }

    String selectDrinks(int menuSelected,Scanner scanner){
        System.out.println(menus.get(menuSelected-1).getDrinks().toString());
        System.out.println("choose a main dish from the list above");

        return menus.get(menuSelected-1).getDrinks().get(scanner.nextInt()-1);
    }
}
