package com.ihorchyzh.app.classwork.lesson15;

/**
 * Created by ihorchyzh on 3/2/17.
 */
public class BMW extends Car {

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;

    public void drive() {
        System.out.println("BMW Drive");
    }

}