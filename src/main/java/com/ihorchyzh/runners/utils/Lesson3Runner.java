package com.ihorchyzh.runners.utils;

import com.ihorchyzh.app.utils.PrimitiveConvertor;

/**
 * Created by ihorchyzh on 1/22/17.
 */
public class Lesson3Runner {


    public static void main(String[] args) {

        PrimitiveConvertor primitiveConvertor = new PrimitiveConvertor();

        primitiveConvertor.floatToChar(124f);
        primitiveConvertor.intToChar(124);
        primitiveConvertor.charToInt('|');

    }

}