package com.ihorchyzh.runners.utils;

import com.ihorchyzh.app.utils.PrimitiveConverter;

/**
 * Created by ihorchyzh on 1/22/17.
 */
public class PrimitiveConvertorRunner {


    public static void main(String[] args) {

        PrimitiveConverter primitiveConverter = new PrimitiveConverter();

        float floatNumber = 124f;
        System.out.println("Input float value is " + floatNumber + ". Output char value is " +
                primitiveConverter.floatToChar(floatNumber));

        int intNumber = 124;
        System.out.println("Input integer value is " + intNumber + ". Output char value is " +
                primitiveConverter.intToChar(intNumber));

        char charSymbol = '|';
        System.out.println("Input char value is " + charSymbol + ". Output integer value is " +
                primitiveConverter.charToInt(charSymbol));

    }

}