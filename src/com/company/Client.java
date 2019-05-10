package com.company;

public class Client {

    public static void main(String[] args) {

        int clientsChoice = 0;

        ClientsChoiceSelector selector = new ClientsChoiceSelector();

        do {

            System.out.println("[1] Insert Airplane");
            System.out.println("[2] Insert Menu");
            System.out.println("[3] Insert flight");
            System.out.println("[4] Cancel Flight");
            System.out.println("[5] Book Ticket");
            System.out.println("[6] Cancel Ticket");
            System.out.println("[7] Order Menu Items (Available only in Business Seats)");
            System.out.println("[8] Seats Capacity for a certain Flight");
            System.out.println("[9] Print the airplanes");
            System.out.println("[10] Print the menus");
            System.out.println("[0] Exit");

            clientsChoice = selector.caseSelector();

        } while (clientsChoice != 0);
    }
}
