package com.company;

public class U1 extends Rocket {

    private double chanceOfLaunchExplosion;
    private double chanceOfLandExplosion;

    public  U1() {
        setCurrentWeight(10000);
        setMaxWeight(18000);
        setRocketCost(100000);
    }

    @Override
    public boolean land() throws ArithmeticException {
        chanceOfLandExplosion = 1 * (getCurrentWeight() / (double)getMaxWeight());
        if(chanceOfLandExplosion > Math.random() * 100) {
            return false;
        }
        else {
            return super.land();
        }
    }

    @Override
    public boolean launch() throws ArithmeticException {
        chanceOfLaunchExplosion = 5 * (getCurrentWeight() / (double)getMaxWeight());
        if(chanceOfLaunchExplosion > Math.random() * 100) {
            return false;
        }
        else {
            return super.land();
        }
    }
}
