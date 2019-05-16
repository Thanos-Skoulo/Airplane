package com.company;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        int exit = 0;
        Gson gson = new Gson();
        ArrayList<Airplane> airplanes = new ArrayList<>();
        try (JsonReader reader = new JsonReader(new FileReader("Airplanes.json"))) {
            airplanes = gson.fromJson(reader,new TypeToken<ArrayList<Airplane>>(){}.getType());
            System.out.println(airplanes.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ClientsChoiceSelector selector = new ClientsChoiceSelector();

        if(airplanes.size() > 0)
            selector.LoadWithAirplanes(airplanes);


        Scanner scanner = new Scanner(System.in);

        do {
            showUserOptions();
        } while (selector.caseSelector(scanner) != exit);

        scanner.close();
    }

    private static void showUserOptions() {

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
    }
}
