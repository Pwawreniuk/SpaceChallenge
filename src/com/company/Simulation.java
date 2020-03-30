package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList loadItems(String fileName) throws FileNotFoundException{
        ArrayList<Item> items = new ArrayList<Item>();
        File phase = new File(fileName);
        Scanner scanner = new Scanner(phase);

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] item = line.split("=");
            items.add(new Item(item[0], Integer.valueOf(item[1])));
        }
        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        ArrayList<Rocket> U1List = new ArrayList<>();
        Rocket rocket = new U1();

        for (Item item: items) {
            if (!rocket.canCarry(item)) {
                U1List.add(rocket);
                rocket = new U1();
                System.out.println("New U1 rocket added.");
            }
            rocket.carry(item);
        }

        U1List.add(rocket);
        return U1List;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        ArrayList<Rocket> U2List = new ArrayList<>();
        Rocket rocket = new U2();

        for (Item item: items) {
            if (!rocket.canCarry(item)) {
                U2List.add(rocket);
                rocket = new U2();
                System.out.println("New U2 rocket added.");
            }
            rocket.carry(item);
        }

        U2List.add(rocket);
        return U2List;
    }

    public int runSimulation(ArrayList<Rocket> RocketList) {
        int budget = 0;
        for(Rocket rocket: RocketList) {
            while(!rocket.launch() || !rocket.land()) {
                budget += rocket.getRocketCost();
                System.out.println("Rocket crushed. Cost has been raised by " + rocket.getRocketCost());
            }
            budget += rocket.getRocketCost();
        }
        return budget;
    }

}