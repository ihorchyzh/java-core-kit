package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15poly0.*;

/**
 * Created by ihorchyzh on 3/2/17.
 */
public class Lesson15Poly0RunnerClass {

    public static void main(String[] args) {

        Car audi = new Audi();
        Car bmw = new BMW();
        Car gmc = new GMC();
        Car lexus = new Lexus();

        runAnyCarDrive(audi);
        runAnyCarDrive(bmw);
        runAnyCarDrive(gmc);
        runAnyCarDrive(lexus);

    }

    private static void runAnyCarDrive(Car car) {
        car.drive();
    }
}