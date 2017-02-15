package com.ihorchyzh.runners.classwork.lesson9;

import com.ihorchyzh.app.classwork.lesson9.Lesson9Class;

/**
 * Created by ihorchyzh on 2/13/17.
 */
public class Lesson9RunnerClass {

    public static void main(String[] args) {

        Lesson9Class lesson9Class = new Lesson9Class();

        System.out.println("concatenation: " + lesson9Class.concatenation("Ihor", "Chyzh"));

        char[] arrayOfChars = {'\u0044', '|', '#'};
        System.out.println("outArrayOfChars: " + lesson9Class.outArrayOfChars(arrayOfChars));

        System.out.println("outArrayOfChars2: " + lesson9Class.outArrayOfChars2(arrayOfChars));

        System.out.println("byteToString: " + lesson9Class.byteToString((byte) 0));
        System.out.println("stringToByte: " + lesson9Class.stringToByte("0"));

        System.out.println("shortToString: " + lesson9Class.shortToString((short) 1));
        System.out.println("stringToShort: " + lesson9Class.stringToShort("1"));

        System.out.println("intToString: " + lesson9Class.intToString(2));
        System.out.println("stringToInt: " + lesson9Class.stringToInt("2"));

        System.out.println("longToString: " + lesson9Class.longToString(3L));
        System.out.println("stringToLong: " + lesson9Class.stringToLong("3"));

        System.out.println("floatToString: " + lesson9Class.floatToString(4f));
        System.out.println("stringToFloat: " + lesson9Class.stringToFloat("4f"));

        System.out.println("doubleToString: " + lesson9Class.doubleToString(5d));
        System.out.println("stringToDouble: " + lesson9Class.stringToDouble("5d"));

        System.out.println("booleanToString: " + lesson9Class.booleanToString(true));
        System.out.println("stringToBoolean: " + lesson9Class.stringToBoolean("true"));

    }
}