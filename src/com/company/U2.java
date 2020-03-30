package com.company;

public class U2 extends Rocket {

    private int chanceOfLaunchExplosion;
    private int chanceOfLandExplosion;

    public U2() {
        setCurrentWeight(18000);
        setMaxWeight(29000);
        setRocketCost(120000);
    }

    @Override
    public boolean land() throws ArithmeticException{
        chanceOfLandExplosion = 4 * getCurrentWeight() / getMaxWeight();
        if(chanceOfLandExplosion > Math.random() * 100) {
            return false;
        }
        else {
            return super.land();
        }
    }

    @Override
    public boolean launch() throws ArithmeticException{
        chanceOfLaunchExplosion = 8 * getCurrentWeight() / getMaxWeight();
        if(chanceOfLaunchExplosion > Math.random() * 100) {
            return false;
        }
        else {
            return super.land();
        }
    }
}
