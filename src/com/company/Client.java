package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        ArrayList<Airplane> airplaneList = new ArrayList<>();
        int clientsChoice;

        do {


            System.out.println("[1] Insert Airplain");
            System.out.println("[2] Insert Menu");
            System.out.println("[3] Insert flight");
            System.out.println("[4] Cancel Flight");
            System.out.println("[5] Book Ticket");
            System.out.println("[6] Cancel Ticket");
            System.out.println("[7] Order Menu Items (Available only in Business Seats)");
            System.out.println("[8] Seats Capacity for a certain Flight");
            System.out.println("[0] Exit");

            Scanner scanner = new Scanner(System.in);
            clientsChoice = scanner.nextInt();

            switch (clientsChoice) {
                case 1:
                    System.out.println("please insert the airplane's ID");
                    int airplaneId = scanner.nextInt();

                    boolean airplaneExists = false;

                    for (Airplane airplane : airplaneList) {

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
                        airplaneList.add(newAirplane);
                    }else{
                        System.out.println("this airplane already exists");
                    }
                    break;
            }

        } while (clientsChoice != 0);
    }
}
