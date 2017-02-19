package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson9.ArrayOperations;

/**
 * Created by ihorchyzh on 2/13/17.
 */
public class Lesson9RunnerClass {

    public static void main(String[] args) {

        ArrayOperations arrayOperations = new ArrayOperations();

        System.out.println("concatenation: " + arrayOperations.concatenation("Ihor", "Chyzh"));

        char[] arrayOfChars = {'\u0044', '|', '#'};
        System.out.println("outArrayOfChars: " + arrayOperations.outArrayOfChars(arrayOfChars));

        System.out.println("outArrayOfChars2: " + arrayOperations.outArrayOfChars2(arrayOfChars));

        System.out.println("byteToString: " + arrayOperations.byteToString((byte) 0));
        System.out.println("stringToByte: " + arrayOperations.stringToByte("0"));

        System.out.println("shortToString: " + arrayOperations.shortToString((short) 1));
        System.out.println("stringToShort: " + arrayOperations.stringToShort("1"));

        System.out.println("intToString: " + arrayOperations.intToString(2));
        System.out.println("stringToInt: " + arrayOperations.stringToInt("2"));

        System.out.println("longToString: " + arrayOperations.longToString(3L));
        System.out.println("stringToLong: " + arrayOperations.stringToLong("3"));

        System.out.println("floatToString: " + arrayOperations.floatToString(4f));
        System.out.println("stringToFloat: " + arrayOperations.stringToFloat("4f"));

        System.out.println("doubleToString: " + arrayOperations.doubleToString(5d));
        System.out.println("stringToDouble: " + arrayOperations.stringToDouble("5d"));

        System.out.println("booleanToString: " + arrayOperations.booleanToString(true));
        System.out.println("stringToBoolean: " + arrayOperations.stringToBoolean("true"));

    }
}