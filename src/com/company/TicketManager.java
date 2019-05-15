package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketManager {

    ArrayList<Ticket> tickets = new ArrayList<>();

    void create(Ticket ticket, Scanner scanner, boolean isBusinessSeat){


        System.out.println("please insert passenger's name");
        String passengersName = scanner.next();
        ticket.setPassengersName(passengersName);
        ticket.setDateOfIssue(LocalDate.now());
        System.out.println("please insert ticket's price");
        ticket.setTicketPrice(scanner.nextInt());

        tickets.add(ticket);
        for(Ticket ticket1 : tickets) {
            System.out.println(ticket1.toString());
        }

    }


    void removeTicket(int ticketId) {
        for (Ticket ticket1 : tickets){

            if(ticket1.getTicketId() == ticketId){
                tickets.remove(ticket1);
            }

        }
        for(Ticket ticket1 : tickets) {
            System.out.println(ticket1.toString());
        }


    }
}
