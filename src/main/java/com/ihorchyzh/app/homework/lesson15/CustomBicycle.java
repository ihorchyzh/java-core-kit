package com.ihorchyzh.app.homework.lesson15;

/**
 * Created by ihorchyzh on 3/5/17.
 */
public class CustomBicycle extends Bicycle {

    private int speed;
    private int gear;


    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed is " + speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear is " + gear);
    }

    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }
}