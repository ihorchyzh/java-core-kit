package com.ihorchyzh.app.utils.runners;

import com.ihorchyzh.app.utils.convertors.PrimitiveConvertor;

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
