package com.ihorchyzh.runners.classwork.lesson9;

import com.ihorchyzh.app.classwork.lesson9.Lesson9;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/13/17.
 */
public class Lesson9Runner {

    public static void main(String[] args) {

        Lesson9 lesson9 = new Lesson9();

        System.out.println("concatenation: " + lesson9.concatenation("Ihor", "Chyzh"));

        char[] arrayOfChars = {'\u0044', '|', '#'};
        System.out.println("outArrayOfChars: " + lesson9.outArrayOfChars(arrayOfChars));

        System.out.println("outArrayOfChars2: " + lesson9.outArrayOfChars2(arrayOfChars));

        System.out.println("byteToString: " + lesson9.byteToString((byte) 0));
        System.out.println("stringToByte: " + lesson9.stringToByte("0"));

        System.out.println("shortToString: " + lesson9.shortToString((short) 1));
        System.out.println("stringToShort: " + lesson9.stringToShort("1"));

        System.out.println("intToString: " + lesson9.intToString(2));
        System.out.println("stringToInt: " + lesson9.stringToInt("2"));

        System.out.println("longToString: " + lesson9.longToString(3L));
        System.out.println("stringToLong: " + lesson9.stringToLong("3"));

        System.out.println("floatToString: " + lesson9.floatToString(4f));
        System.out.println("stringToFloat: " + lesson9.stringToFloat("4f"));

        System.out.println("doubleToString: " + lesson9.doubleToString(5d));
        System.out.println("stringToDouble: " + lesson9.stringToDouble("5d"));

        System.out.println("booleanToString: " + lesson9.booleanToString(true));
        System.out.println("stringToBoolean: " + lesson9.stringToBoolean("true"));

    }
}