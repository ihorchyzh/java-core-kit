package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15interface.AMABicycle;
import com.ihorchyzh.app.classwork.lesson15interface.AMCEBicycle;
import com.ihorchyzh.app.classwork.lesson15interface.Bicycle;

/**
 * Created by ihorchyzh on 3/9/17.
 */
public class Lesson15PolyInterfaceRunnerClass {

    public static void main(String[] args) {
        Bicycle bicycle = new AMCEBicycle();
        Lesson15PolyInterfaceRunnerClass.manageAllBicycle(bicycle, 3, 2);
        Bicycle amaBicycle = new AMABicycle();
        Lesson15PolyInterfaceRunnerClass.manageAllBicycle(amaBicycle, 4, 2);
        Bicycle amaBicycle3 = new AMABicycle();
        Lesson15PolyInterfaceRunnerClass.manageAllBicycle(amaBicycle3, 7, 1);
        System.out.printf(Bicycle.MODEL);
    }

    private static void manageAllBicycle(Bicycle bicycle, int gear, int cadence) {
        bicycle.changeGear(gear);
        bicycle.changeCadence(cadence);
    }
}