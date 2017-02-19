package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson1.Casting;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class Lesson1RunnerClass {

    public static void main(String[] args) {

        Casting casting = new Casting();

        float floatNumber = 124f;
        System.out.println("Input float value is " + floatNumber + ". Output char value is " +
                casting.floatToChar(floatNumber));

        int intNumber = 124;
        System.out.println("Input integer value is " + intNumber + ". Output char value is " +
                casting.intToChar(intNumber));

        char charSymbol = '|';
        System.out.println("Input char value is " + charSymbol + ". Output integer value is " +
                casting.charToInt(charSymbol));

        float floatNumber2 = 12.4f;
        System.out.println(casting.narrowing(floatNumber2));

        int intNumber2 = 10;
        System.out.println(casting.widening(intNumber2));

    }

}