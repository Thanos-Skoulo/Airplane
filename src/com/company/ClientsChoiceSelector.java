package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

class ClientsChoiceSelector {

//    private ArrayList<LocalDate> datesOfFlights = new ArrayList<>();

    private FlightManager flightManager;
    private AirplaneManager airplaneManager;
    private TicketManager ticketManager;
    private MenuManager menuManager;

    ClientsChoiceSelector() {
        this.flightManager = new FlightManager();
        this.airplaneManager = new AirplaneManager();
        this.ticketManager = new TicketManager();
        this.menuManager = new MenuManager();
    }

    int caseSelector(Scanner scanner){

        int clientsChoice =  Validator.requestInt(scanner);
        Choice choice = new Choice();

        switch (clientsChoice) {

            case 0:
                choice.exitSelected();
                break;

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
                break;
            case 5:
                choice.bookTicketSelected(scanner);
                break;
            case 6:
                choice.cancelTicketSelected(scanner);
                break;
            case 7:
                choice.orderMenuItemSelected(scanner);
                break;
            case 8:
                choice.seatsCapacitySelected(scanner);
                break;
            case 9:
                choice.printAirplanesSelected();
                break;
            case 10:
                choice.printMenusSelected();
                break;
            case 11:
                choice.printFlightsSelected();
                break;
        }

        return clientsChoice;
    }

    public void LoadWithAirplanes(ArrayList<Airplane> airplanes) {
        airplaneManager.setAirplanes(airplanes);
    }


    private class Choice {




        private void airplaneOptionSelected(Scanner scanner) {
            System.out.println("please insert the airplane's ID");
            int airplaneId = Validator.requestInt(scanner);


            if (!airplaneManager.airplaneExists(airplaneId)) {
                System.out.println("please insert the number of rows");
                int numberOfRows =  Validator.requestInt(scanner);

                System.out.println("please insert the number of columns");
                int numberOfColumns =  Validator.requestInt(scanner);
                System.out.println("now insert the number of Business Class rows");
                int numberOfBusinessClassRows =  Validator.requestInt(scanner);
                if(numberOfColumns == 0 || numberOfBusinessClassRows == 0 && numberOfRows == 0){
                    System.out.println("You cannot create an airplane without any seats");
                }else {
                    System.out.println("please write a description about this airplane");
                    String airplaneDescription = scanner.next();
                    Airplane newAirplane = new Airplane(airplaneId, numberOfRows, numberOfColumns, numberOfBusinessClassRows, airplaneDescription);
                    airplaneManager.getAirplanes().add(newAirplane);
                }
            } else {
                System.out.println("this airplane already exists");
            }
        }

        private void menuOptionSelected(Scanner scanner) {
            System.out.println("please insert the menu's ID");
            int menuId =  Validator.requestInt(scanner);

            if (!menuManager.menuExists(menuId)) {

                Menu menu = menuManager.create(menuId);

                menuManager.addDishes(menu,scanner);
                menuManager.addDesserts(menu,scanner);
                menuManager.addDrinks(menu,scanner);

                menuManager.addMenu(menu);

            } else {
                System.out.println("this menu already exits");
            }
        }

        private void insertFlightSelected(Scanner scanner){

            LocalDate date;

            System.out.println("Please insert flight's ID");
            int flightId =  Validator.requestInt(scanner);

            if(!flightManager.flightExists(flightId)){
                System.out.println("Please insert airplane's ID of the airplane you want to add to this flight");
                boolean airplaneExists;
                int airplaneId;


                do {
                    airplaneId = Validator.requestInt(scanner);
                    airplaneExists = airplaneManager.airplaneExists(airplaneId);

                    if(!airplaneExists){
                        System.out.println("this airplane doesn't exist");
                        System.out.println("please reinsert airplane's ID ");
                    }

                }while (!airplaneExists);

                System.out.println("please insert the date for this flight");
                do{
                    date = Validator.requestDate(scanner);
                }while (!Validator.isAFutureDate(date));

                Flight newFlight = new Flight(flightId,date,airplaneManager.getAirplanes().get(airplaneId-1));

                if(flightManager.airplaneHasAFlightThisDay(airplaneId,date)){
                    System.out.println("this airplane  already has a flight for this day ");

                }else{
                    flightManager.addFlight(newFlight);
                }

            }else{ System.out.println("this flight already exists"); }

        }

        private void removeFlightSelected(Scanner scanner) {

            System.out.println("Choose which fight to remove by typing its ID");
            int flightIdToRemove =  Validator.requestInt(scanner);
            flightManager.removeFlight(flightIdToRemove);


        }

        private void printAirplanesSelected() {

            airplaneManager.printAirplanes();

        }

        private void printMenusSelected() {
            menuManager.printMenus();

        }


        private void printFlightsSelected() {
            for(Flight flight : flightManager.getFlights()) {
                System.out.println(flight.toString());
            }
        }

        void seatsCapacitySelected(Scanner scanner) {
            System.out.println("please insert flight's ID");
            int flightId =  Validator.requestInt(scanner);
            if(flightManager.flightExists(flightId)){
               flightManager.printSeatTable(flightId);
            }else{
                System.out.println("this flight doesn't exist");
            }

        }

        void bookTicketSelected(Scanner scanner) {
            System.out.println("please insert flight's ID");

            int flightId =  Validator.requestInt(scanner);
            int seatId;
            if(flightManager.flightExists(flightId)){
                flightManager.printSeatTable(flightId);
                System.out.println("please insert the id of the seat that you want");

                seatId = Validator.requestInt(scanner);

                if(flightManager.isSeatAvailable(seatId,flightId)) {
                    Seat bookedSeat = flightManager.bookSeat(seatId, flightId);
                    boolean isBusinessSeat = bookedSeat instanceof BusinessSeat;
                    Ticket ticket = new Ticket(seatId, flightId);
                    ticketManager.create(ticket, scanner, isBusinessSeat);
                    flightManager.printSeatTable(flightId);
                }else {
                    System.out.println("this seat is already taken");
                }
            }
        }

        void cancelTicketSelected(Scanner scanner) {
            System.out.println("please insert flight's ID you want to cancel a ticket from");
            int flightId =  Validator.requestInt(scanner);
            flightManager.printSeatTable(flightId);
            System.out.println("please insert the id of the ticket you want to remove");
            int seatId =  Validator.requestInt(scanner);
            if(!flightManager.isSeatAvailable(seatId,flightId)){
                ticketManager.removeTicket(seatId);
                flightManager.removeSeat(seatId,flightId);
                flightManager.printSeatTable(flightId);
            }else{
                System.out.println("this seat is already available");
            }

        }

        void orderMenuItemSelected(Scanner scanner) {
            System.out.println("please insert the flight you want to choose a seat to order a menu");
            int flightId =  Validator.requestInt(scanner);
            if(flightManager.flightExists(flightId)) {
                System.out.println("ok! now insert the seat id");
                int seatId =  Validator.requestInt(scanner);
                boolean isBusinessSeat = flightManager.bookSeat(seatId,flightId) instanceof BusinessSeat;

                if(isBusinessSeat){

                    System.out.println("now choose a menu from the list");
                    menuManager.printMenus();
                    int menuSelected =  Validator.requestInt(scanner);
                    if(menuManager.menuExists(menuSelected)) {

                        System.out.println("you choose dish: " + menuManager.selectDish(menuSelected, scanner)
                                + ", drink: " + menuManager.selectDrinks(menuSelected, scanner)
                                + ", dessert: " + menuManager.selectDessert(menuSelected, scanner));
                    }else{
                        System.out.println("this menu does not exist");
                    }
                }else{
                    System.out.println("this is not a business seat");
                }
            }else {
                System.out.println("this flight doesn't exist");
            }


        }


        public void exitSelected() {

            State state = new State(airplaneManager.getAirplanes(), flightManager.getFlights(), menuManager.getMenus());

           try
                   (FileWriter fileWriter = new FileWriter("AirplaneExerciseState.json")){
               Gson gson = new GsonBuilder().setPrettyPrinting().create();
               gson.toJson(state, fileWriter);
           }catch (IOException ex){
               System.out.println("something went wrong");
           }


        }
    }
}
