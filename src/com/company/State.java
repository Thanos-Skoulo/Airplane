package com.company;

import java.util.ArrayList;

public class State {

    ArrayList<Airplane> airplanes;
    ArrayList<Flight> flights;
    ArrayList<Menu> menus;

    public State(ArrayList<Airplane> airplanes, ArrayList<Flight> flights, ArrayList<Menu> menus) {
        this.airplanes = airplanes;
        this.flights = flights;
        this.menus = menus;
    }
}
