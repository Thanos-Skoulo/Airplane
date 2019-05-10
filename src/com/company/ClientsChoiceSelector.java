package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientsChoiceSelector {

    private static final int ADD = 1;
    private ArrayList<Airplane> airplanes = new ArrayList<>();
    private ArrayList<Menu> menues = new ArrayList<>();

    public int caseSelector(){

        Scanner scanner = new Scanner(System.in);
        int clientsChoice = scanner.nextInt();

        switch (clientsChoice) {
            case 1:
                airplaneOptionSelected(scanner);
                break;
            case 2:
                menuOptionSelected(scanner);
                break;
            case 9:
                printAirplanesSelected();
        }

        return clientsChoice;
    }

    private void printAirplanesSelected() {
      for(Airplane airplane : airplanes)
          System.out.println(airplane.toString());
    }

    private void airplaneOptionSelected(Scanner scanner) {
        System.out.println("please insert the airplane's ID");
        int airplaneId = scanner.nextInt();

        boolean airplaneExists = false;

        for (Airplane airplane : airplanes) {

            if (airplaneId == airplane.getAirplaneID()) {
                airplaneExists = true;
            }

        }

        if (!airplaneExists) {
            System.out.println("please insert the number of rows");
            int numberOfRows = scanner.nextInt();
            System.out.println("please insert the number of columns");
            int numberOfColumns = scanner.nextInt();
            System.out.println("now insert the number of Business Class rows");
            int numberOfBusinessClassRows = scanner.nextInt();
            System.out.println("please write a description about this airplane");
            String airplaneDescription = scanner.next();
            Airplane newAirplane = new Airplane(airplaneId, numberOfRows, numberOfColumns, numberOfBusinessClassRows, airplaneDescription);
            airplanes.add(newAirplane);
        }else{
            System.out.println("this airplane already exists");
        }
    }

    private void menuOptionSelected(Scanner scanner) {
        System.out.println("please insert the menu's ID");
        int menuId = scanner.nextInt();
        boolean menuExists = false;

        for(Menu menu : menues){
            if(menuId == menu.getMenuId()) {
                menuExists = true;
            }
        }

        if (!menuExists){

            Menu menu = new Menu(menuId);
            System.out.println("Add as many main plates as you want");

            menu.getMainDish().add(scanner.next());


            System.out.println("to add another dish in this list press 1 else press 2 to stop");
            while(scanner.nextInt() == ADD){
                String newDish =scanner.next();
                if(!menu.getMainDish().contains(newDish)){
                    menu.getMainDish().add(newDish);
                }
                System.out.println("to add another dish in this list press 1 else press 2 to stop");
            }

            System.out.println("now add as meny desserts aw you want");
            menu.getDesserts().add(scanner.next());
            System.out.println("to add another dessert in this list press 1 else press 2 to stop");
            while (scanner.nextInt() == ADD){
                String newDessert = scanner.next();
                if(!menu.getDesserts().contains(newDessert)){
                    menu.getDesserts().add(newDessert);
                }
                System.out.println("to add another dessert in this list press 1 else press 2 to stop");
            }

            System.out.println("now it's time to add some drinks");
            menu.getDrinks().add(scanner.next());
            System.out.println("to add another drink in this list press 1 else press 2 to stop");

            while (scanner.nextInt() == ADD){
                String newDrink = scanner.next();
                if(!menu.getDesserts().contains(newDrink)){
                    menu.getDesserts().add(newDrink);
                }
                System.out.println("to add another drink in this list press 1 else press 2 to stop");
            }

        }else{
            System.out.println("this menu already exits");
        }
    }
}
