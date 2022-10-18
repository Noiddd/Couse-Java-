package Gym_threads;

import java.util.ArrayList;

public class Gym {
    private int availableSlots = 10;
    private ArrayList<GymRat> accountList;

    public Gym(ArrayList<GymRat> accountList) {
        this.accountList = accountList;
    }


    public synchronized void bookClass(String name, int numberOfSlots){
        if(availableSlots >= numberOfSlots && numberOfSlots > 0) {
            System.out.println("Hello " + name + ", you've successfully booked a class for " + numberOfSlots);
            availableSlots = availableSlots - numberOfSlots;
        } else {
            System.out.println("Sorry " + name + ", there are no available classes for the number of slots you are booking for...");
        }
    }

    public synchronized void squatRack(String name){

    }

    public synchronized void benchPress(String name){

    }

    public synchronized void barbellRows(String name) {

    }

    public synchronized void treadMill(String name) {

    }
}
