package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15.*;

/**
 * Created by ihorchyzh on 3/2/17.
 */
public class Lesson15RunnerClass {

    public static void main(String[] args) {

        Car audi = new Audi();
        Car bmw = new BMW();
        Car gmc = new GMC();
        Car lexus = new Lexus();


        runAllCarsDrive(bmw);

    }

    public static void runAllCarsDrive(Car car) {
        car.drive();
    }
}