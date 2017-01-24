package com.ihorchyzh.app.utils;

/**
 * Created by ihorchyzh on 1/22/17.
 */
public class PrimitiveConverter {

    public char floatToChar(float floatNumber){

        char charSymbol = (char) floatNumber;
        System.out.println("Input float value is " + floatNumber + ". Output char value is " + charSymbol);
        return charSymbol;

    }

    public char intToChar(int intNumber){

        char charSymbol = (char) intNumber;
        System.out.println("Input integer value is " + intNumber + ". Output char value is " + charSymbol);
        return charSymbol;

    }

    public int charToInt(char charSymbol) {

        int intNumber = (int) charSymbol;
        System.out.println("Input char value is " + charSymbol + ". Output integer value is " + intNumber);
        return intNumber;

    }

}