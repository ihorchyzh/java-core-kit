package com.ihorchyzh.app.classwork.lesson15interface;

/**
 * Created by ihorchyzh on 3/9/17.
 */
public class AMABicycle implements Bicycle {


    @Override
    public void changeCadence(int newValue) {
        System.out.println(newValue);
    }

    @Override
    public void changeGear(int newValue) {
        System.out.println(newValue);
    }
}