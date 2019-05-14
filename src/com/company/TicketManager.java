package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class TicketManager {

    public void create(Ticket ticket, Scanner scanner, boolean isBusinessSeat){

        System.out.println("please insert passenger's name");
        String passengersName = scanner.next();
        ticket.setPassengersName(passengersName);
        ticket.setDateOfIssue(LocalDate.now());
        if(isBusinessSeat){

        }


    }





}
