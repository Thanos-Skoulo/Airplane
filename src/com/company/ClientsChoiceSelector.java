package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class ClientsChoiceSelector {

    private static final int ADD = 1;
    private ArrayList<Airplane> airplanes = new ArrayList<>();
    private ArrayList<Menu> menues = new ArrayList<>();
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<LocalDate> datesOfFlights = new ArrayList<>();

    int caseSelector(){

        Scanner scanner = new Scanner(System.in);
        int clientsChoice = scanner.nextInt();
        Choice choice = new Choice();

        switch (clientsChoice) {
            case 1:
                choice.airplaneOptionSelected(scanner);
                break;
            case 2:
                choice.menuOptionSelected(scanner);
                break;
            case 3:
                choice.insertFlightSelected(scanner);
                break;
            case 4:
                choice.removeFlightSelected(scanner);
            case 9:
                choice.printAirplanesSelected();
                break;
            case 10:
                choice.printMenuesSelected();


        }

        return clientsChoice;
    }

   

    
    private class Choice {




        
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
            } else {
                System.out.println("this airplane already exists");
            }
        }

        private void menuOptionSelected(Scanner scanner) {
            System.out.println("please insert the menu's ID");
            int menuId = scanner.nextInt();
            boolean menuExists = false;

            for (Menu menu : menues) {
                if (menuId == menu.getMenuId()) {
                    menuExists = true;
                }
            }

            if (!menuExists) {

                Menu menu = new Menu(menuId);
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

                System.out.println("now it's time to add some drinks");
                menu.getDrinks().add(scanner.next());
                System.out.println("to add another drink in this list press 1 else press 2 to stop");

                while (scanner.nextInt() == ADD) {
                    String newDrink = scanner.next();
                    if (!menu.getDesserts().contains(newDrink)) {
                        menu.getDesserts().add(newDrink);
                    }
                    System.out.println("to add another drink in this list press 1 else press 2 to stop");
                }
                Menu newMenu = new Menu(menuId,menu.getMainDish(),menu.getDesserts(),menu.getDrinks());
                menues.add(newMenu);

            } else {
                System.out.println("this menu already exits");
            }
        }

        private void insertFlightSelected(Scanner scanner){

            System.out.println("Please insert flight's ID");
            int flightId = scanner.nextInt();
            boolean flightExists=false;
            for(Flight flight : flights){
                if(flightId == flight.getFlightId()){
                    flightExists =true;
                }
            }
            if(!flightExists){
                System.out.println("Please insert airplane's ID of the airplane you want to add to this flight");
                boolean airplaneExists = false;
                int airplaneId;

                do {
                    airplaneId =scanner.nextInt();

                    for (Airplane airplane : airplanes) {
                        if (airplaneId == airplane.getAirplaneID()) {
                            airplaneExists = true;

                        }

                    }
                    if(!airplaneExists){
                        System.out.println("this airplane doesn't exist");
                    }
                }while (!airplaneExists);

                System.out.println("please insert the date for this flight");
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
                LocalDate date = LocalDate.parse(scanner.next(), dateFormat);
                Flight newFlight = new Flight(flightId,date,airplanes.get(airplaneId-1));

                boolean airplaneHasAFlightThisDay = false;

//                for(int i = 0;i < flights.size(); i++ ){
//
//                    if(flights.get(i).getAirplane().getAirplaneID() == airplaneId){
//                        for(i = 0; i< flights.size(); i++){
//                            if(flights.get(i).getFlightDate().toString().equals(date.toString())){
//                                airplaneHasAflightThisDay = true;
//                            }
//                        }
//                    }
                for(Flight flight : flights){
                    if(flight.getAirplane().getAirplaneID() == airplaneId && flight.getFlightDate().toString().equals(date.toString())){
                        airplaneHasAFlightThisDay = true;
                    }
                }
                if(airplaneHasAFlightThisDay){
                    System.out.println("this airplane  already has a flight for this day ");

                }else{
                    flights.add(newFlight);
                    for(Flight flight : flights) {
                        System.out.println(flights.toString());
                        System.out.println(" ");
                    }
                }

            }else{ System.out.println("this flight already exists"); }

        }

        private void removeFlightSelected(Scanner scanner) {

            System.out.println("Choose which fight to remove by typing its ID");
            int flightIdToRemove = scanner.nextInt();
            


        }

        private void printAirplanesSelected() {
            for(Airplane airplane : airplanes)
                System.out.println(airplane.toString());
        }

        private void printMenuesSelected() {
            for(Menu menu: menues){
                System.out.println(menu.toString());
            }
        }


    }
}
