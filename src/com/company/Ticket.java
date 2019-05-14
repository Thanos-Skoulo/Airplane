package com.company;

import java.time.LocalDate;

public class Ticket {

    private int ticketId;
    private String passengersName;
    private int ticketPrice;
    private int flightId;
    private String ticketType;
    private String seatType;
    private LocalDate dateOfIssue;
    private String chosenPlate;
    private String chosenDessert;
    private String chosenDrink;

    public Ticket(int ticketId,int flightId){
        this.ticketId = ticketId;
        this.flightId = flightId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getPassengersName() {
        return passengersName;
    }

    public void setPassengersName(String passengersName) {
        this.passengersName = passengersName;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getChosenPlate() {
        return chosenPlate;
    }

    public void setChosenPlate(String chosenPlate) {
        this.chosenPlate = chosenPlate;
    }

    public String getChosenDessert() {
        return chosenDessert;
    }

    public void setChosenDessert(String chosenDessert) {
        this.chosenDessert = chosenDessert;
    }

    public String getChosenDrink() {
        return chosenDrink;
    }

    public void setChosenDrink(String chosenDrink) {
        this.chosenDrink = chosenDrink;
    }





}
