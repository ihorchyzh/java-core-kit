package com.ihorchyzh.app.classwork.lesson9;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/14/17.
 */
public class ArrayOperations {

    public String concatenation(String firstName, String secondName) {
        String name = firstName.concat(secondName);
        return name;

    }

    public String outArrayOfChars(char[] arrayOfChars) {
        String array = java.util.Arrays.toString(arrayOfChars);
        return array;
    }

    public String outArrayOfChars2(char[] arrayOfChars2) {
        String tmp = "";
        for (int i = 0; i < arrayOfChars2.length; i++) {
            tmp += arrayOfChars2[i];
        }
        return tmp;
    }

    public String byteToString(byte byteValue) {
        String tmp = String.valueOf(byteValue);
        return tmp;
    }

    public byte stringToByte(String stringValue) {
        byte tmp = Byte.valueOf(stringValue);
        return tmp;
    }

    public String shortToString(short shortValue) {
        String tmp = String.valueOf(shortValue);
        return tmp;
    }

    public short stringToShort(String stringValue) {
        short tmp = Short.valueOf(stringValue);
        return tmp;
    }

    public String intToString(int intValue) {
        String tmp = String.valueOf(intValue);
        return tmp;
    }

    public int stringToInt(String stringValue) {
        int tmp = Integer.valueOf(stringValue);
        return tmp;
    }

    public String longToString(long longValue) {
        String tmp = String.valueOf(longValue);
        return tmp;
    }

    public long stringToLong(String stringValue) {
        long tmp = Long.valueOf(stringValue);
        return tmp;
    }

    public String floatToString(float floatValue) {
        String tmp = String.valueOf(floatValue);
        return tmp;
    }

    public float stringToFloat(String stringValue) {
        float tmp = Float.valueOf(stringValue);
        return tmp;
    }

    public String doubleToString(double doubleValue) {
        String tmp = String.valueOf(doubleValue);
        return tmp;
    }

    public double stringToDouble(String stringValue) {
        double tmp = Double.valueOf(stringValue);
        return tmp;
    }

    public String booleanToString(boolean booleanValue) {
        String tmp = String.valueOf(booleanValue);
        return tmp;
    }

    public boolean stringToBoolean(String stringValue) {
        boolean tmp = Boolean.valueOf(stringValue);
        return tmp;
    }

}