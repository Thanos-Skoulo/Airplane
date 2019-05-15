package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights = new ArrayList<>();

    ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    boolean flightExists(int flightId){

        boolean flightExists=false;

        for(Flight flight : flights) {
            if (flightId == flight.getFlightId()) {
                flightExists = true;
            }
        }

        return flightExists;
    }

    boolean airplaneHasAFlightThisDay(int airplaneId, LocalDate date){

        boolean airplaneHasAFlightThisDay = false;

        for(Flight flight : flights){
            if(flight.getAirplane().getAirplaneID() == airplaneId && flight.getFlightDate().isEqual((date))){
                airplaneHasAFlightThisDay = true;
            }
        }
        return airplaneHasAFlightThisDay;
    }

    void printSeatTable(int flightId){
        for(Flight flight : flights){
            if(flight.getFlightId() == flightId){
                flight.printSeatTable();
            }
        }
    }


    boolean isSeatAvailable(int seatId, int flightId) {

        for(Flight flight : flights){
            if(flight.getFlightId() == flightId){
               return flight.IsSeatAvailable(seatId);
            }
        }

        return false;
    }

    Seat bookSeat(int seatId, int flightId) {

        for(Flight flight : flights){
            if(flight.getFlightId() == flightId){
                return flight.bookSeat(seatId);

            }
        }
        return null;

    }


    void removeFlight(int flightIdToRemove) {

        for(Flight flight : flights){
            if (flightIdToRemove == flight.getFlightId()){
                flights.remove(flight);
                System.out.println(flights.toString());
            }

        }
    }

    void addFlight(Flight newFlight) {
            flights.add(newFlight);
    }

    Seat removeSeat(int seatId, int flightId) {
        for(Flight flight : flights){
            if(flight.getFlightId() == flightId){
                return flight.removeSeat(seatId);

            }
        }
        return null;
    }
}
