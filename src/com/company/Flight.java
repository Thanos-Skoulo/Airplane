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

    public Flight(int flightId, LocalDate flightDate, Airplane airplane) {
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.airplane = airplane;

        this.seatTable = new Seat[airplane.getBusinessClassRows()+airplane.getRows()][airplane.getColumns()];
        for(int i=0; i<airplane.getBusinessClassRows() + airplane.getRows(); i++){
            for(int j=0; j<airplane.getColumns(); j++){
                if(i < airplane.getBusinessClassRows())
                    seatTable[i][j] = new BusinessSeat(i*airplane.getColumns()+j, i, j);
                else
                    seatTable[i][j] = new EconomySeat(i*airplane.getColumns() +j, i, j);
            }
        }
    }



    @Override
    public String toString() {
        return "[" + flightId + "]" + " date of flight: " + getFlightDate().toString() + "airplane:" + getAirplane().getAirplaneID();
    }

    public void printSeatTable() {
        for(int i=0; i<airplane.getRows()+airplane.getBusinessClassRows();i++){
            for(int j=0;j<airplane.getColumns(); j++){
                System.out.print(seatTable[i][j].toString());
            }
            System.out.println();
        }
    }

    public boolean IsSeatAvailable(int seatId) {
        for(int i=0; i< getAirplane().getRows()+ getAirplane().getBusinessClassRows();i++){
            for(int j=0;j< getAirplane().getColumns(); j++){
                if(seatId-1 == seatTable[i][j].getSeatId()){
                    return seatTable[i][j].isAvailable();
                }
            }
        }
        return false;
    }

    public Seat bookSeat(int seatId) {
        for(int i=0; i< getAirplane().getRows()+ getAirplane().getBusinessClassRows();i++){
            for(int j=0;j< getAirplane().getColumns(); j++){
                if(seatId -1 == seatTable[i][j].getSeatId()){
                     seatTable[i][j].setAvailable(false);
                     return seatTable[i][j];
                }
            }
        }

        return null;
    }

    public Seat removeSeat(int seatId) {
        for(int i=0; i< getAirplane().getRows()+ getAirplane().getBusinessClassRows();i++){
            for(int j=0;j< getAirplane().getColumns(); j++){
                if(seatId -1 == seatTable[i][j].getSeatId()){
                    seatTable[i][j].setAvailable(true);
                    return seatTable[i][j];
                }
            }
        }

        return null;
    }
}
