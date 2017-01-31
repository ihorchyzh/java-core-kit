package com.ihorchyzh.app.utils;

/**
 * Created by ihorchyzh on 1/22/17.
 */
public class PrimitiveConverter {

    public char floatToChar(float floatNumber){
        char charSymbol = (char) floatNumber;
        return charSymbol;
    }
    public char intToChar(int intNumber){
        char charSymbol = (char) intNumber;
        return charSymbol;
    }
    public int charToInt(char charSymbol) {
        int intNumber = (int) charSymbol;
        return intNumber;
    }

}