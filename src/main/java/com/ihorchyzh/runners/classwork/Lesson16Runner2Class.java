package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson16.Holidays;

/**
 * Created by ihorchyzh on 3/9/17.
 */
public class Lesson16Runner2Class {

    public static void main(String[] args) {
        for (Holidays holidays : Holidays.values()) {

            System.out.println("The holiday is: " + holidays.getHoliday() +
                    ". It is on the " + holidays.getDay() + "th of " + holidays.getMonth() + ".");

        }
    }


}
