package com.ihorchyzh.app.classwork.lesson15poly0;

/**
 * Created by ihorchyzh on 3/2/17.
 */
public class BMW extends Car {

    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void drive() {
        System.out.println("BMW Drive");
    }

}