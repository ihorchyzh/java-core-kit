package com.ihorchyzh.app.classwork.lesson1;

/**
 * Created by ihorchyzh on 1/19/17.
 */
public class Casting {

    public char floatToChar(float floatNumber) {
        char charSymbol = (char) floatNumber;
        return charSymbol;
    }

    public char intToChar(int intNumber) {
        char charSymbol = (char) intNumber;
        return charSymbol;
    }

    public int charToInt(char charSymbol) {
        int intNumber = (int) charSymbol;
        return intNumber;
    }

    public int narrowing(float floatNumber) {
        int intNumber = (int) floatNumber;
        return intNumber;

    }

    public float widening(int intNumber) {
        float floatNumber = intNumber;
        return floatNumber;
    }

}