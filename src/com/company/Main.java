package com.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Simulation simulation = new Simulation();
        ArrayList ItemsPhase1 = simulation.loadItems("src/com/company/phase1.txt");               // Creating list of items for first phase
        ArrayList ItemsPhase2 = simulation.loadItems("src/com/company/phase2.txt");               // Creating list of items for second phase
        ArrayList RocketList = simulation.loadU1(ItemsPhase1);
        RocketList.addAll(simulation.loadU1(ItemsPhase2));
        System.out.println("Simulation of U1 rockets starts...");
        int U1Budget = simulation.runSimulation(RocketList);
        RocketList.clear();

        RocketList = simulation.loadU2(ItemsPhase1);
        RocketList.addAll(simulation.loadU2(ItemsPhase2));
        System.out.println("Simulation of U2 rockets starts...");
        int U2Budget = simulation.runSimulation(RocketList);

        System.out.println("Total budget for U1 rockets is " + U1Budget + " and for U2 rockets it is " + U2Budget);
    }
}