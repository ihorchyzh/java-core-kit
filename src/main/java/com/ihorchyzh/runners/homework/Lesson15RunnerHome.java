package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson15.BicycleWithRing;
import com.ihorchyzh.app.homework.lesson15.BicycleWithRingInterface;
import com.ihorchyzh.app.homework.lesson15.CustomBicycle;

/**
 * Created by ihorchyzh on 3/5/17.
 */
public class Lesson15RunnerHome {

    public static void main(String[] args) {

        BicycleWithRingInterface bicycleWithRingInterface = new BicycleWithRing();
        bicycleWithRingInterface.ring();

        CustomBicycle customBicycle = new CustomBicycle();
        customBicycle.setGear(4);
        customBicycle.setSpeed(10);
        customBicycle.ride();

    }

}