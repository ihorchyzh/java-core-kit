package com.ihorchyzh.app.classwork.lesson15interface;

/**
 * Created by ihorchyzh on 3/9/17.
 */
public class AMCEBicycle implements Bicycle {
    private int speed = 0;
    private int cadence = 0;
    private int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        this.cadence = newValue;
        System.out.println(cadence);
    }

    @Override
    public void changeGear(int newValue) {
        this.gear = newValue;
        System.out.println(gear);
    }

    public void printStates() {
        System.out.println("AMCEBicycle { " +
                "speed = " + speed +
                ", cadence = " + cadence +
                ", gear = " + gear +
                " }");
    }
}