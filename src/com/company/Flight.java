package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {

    private int flightId;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private String departureAirport;
    private String arrivalAirport;
    private Airplane airplane;
    private int seatMenuId;
    private int totalSeatNumber;
    private int bookedSeats;
    private Seat[][] seatTable;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(LocalTime flightTime) {
        this.flightTime = flightTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public int getSeatMenuId() {
        return seatMenuId;
    }

    public void setSeatMenuId(int seatMenuId) {
        this.seatMenuId = seatMenuId;
    }

    public int getTotalSeatNumber() {
        return totalSeatNumber;
    }

    public void setTotalSeatNumber(int totalSeatNumber) {
        this.totalSeatNumber = totalSeatNumber;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Seat[][] getSeatTable() {
        return seatTable;
    }

    public void setSeatTable(Seat[][] seatTable) {
        this.seatTable = seatTable;
    }
}
