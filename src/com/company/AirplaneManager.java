package com.company;

import java.util.ArrayList;

public class AirplaneManager {

    private ArrayList<Airplane> airplanes = new ArrayList<>();


    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(ArrayList<Airplane> airplanes) {
        this.airplanes = airplanes;
    }



    boolean airplaneExists (int airplaneId){

        boolean airplaneExists = false;

        for (Airplane airplane : airplanes) {

            if (airplaneId == airplane.getAirplaneID()) {
                airplaneExists = true;
            }
        }

        return airplaneExists;
    }








}
