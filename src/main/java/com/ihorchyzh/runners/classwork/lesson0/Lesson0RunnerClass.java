package com.ihorchyzh.runners.classwork.lesson0;

import com.ihorchyzh.app.classwork.lesson0.Lesson0Class;

/**
 * Created by ihorchyzh on 1/22/17.
 */
public class Lesson0RunnerClass {


    public static void main(String[] args) {

        Lesson0Class lesson0Class = new Lesson0Class();

        float floatNumber = 124f;
        System.out.println("Input float value is " + floatNumber + ". Output char value is " +
                lesson0Class.floatToChar(floatNumber));

        int intNumber = 124;
        System.out.println("Input integer value is " + intNumber + ". Output char value is " +
                lesson0Class.intToChar(intNumber));

        char charSymbol = '|';
        System.out.println("Input char value is " + charSymbol + ". Output integer value is " +
                lesson0Class.charToInt(charSymbol));

    }

}