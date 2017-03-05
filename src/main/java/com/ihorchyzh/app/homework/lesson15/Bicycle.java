package com.ihorchyzh.app.homework.lesson15;

/**
 * Created by ihorchyzh on 3/5/17.
 */
public abstract class Bicycle {

    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract void setSpeed(int speed);

    public abstract void setGear(int gear);

}