package com.ihorchyzh.runners.utils;

import com.ihorchyzh.app.utils.PrimitiveConverter;

/**
 * Created by ihorchyzh on 1/22/17.
 */
public class PrimitiveConvertorRunner {


    public static void main(String[] args) {

        PrimitiveConverter primitiveConverter = new PrimitiveConverter();

        primitiveConverter.floatToChar(124f);
        primitiveConverter.intToChar(124);
        primitiveConverter.charToInt('|');

    }

}