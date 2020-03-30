package com.company;

public class Rocket implements SpaceShip {

    private int currentWeight;
    private int maxWeight;
    private int rocketCost;

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setRocketCost(int rocketCost) {
        this.rocketCost = rocketCost;
    }

    public int getRocketCost() {
        return rocketCost;
    }

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return  true;
    }

    public boolean canCarry(Item item) {
        if(currentWeight + item.getWeight() <= maxWeight) {
            return true;
        }
        else return false;
    }

    public void carry(Item item) {
        setCurrentWeight(currentWeight + item.getWeight());
    }

}