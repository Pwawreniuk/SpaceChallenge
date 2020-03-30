package com.company;

public interface SpaceShip {
    public boolean launch();                       //indicates if the launch was successful or if the rocket has crushed
    public boolean land();                         //indicates if the landing was successful
    public boolean canCarry(Item item);            //true if the rocket can carry the item
    public void carry(Item item);                  //updates the current weight of the rocket
}
