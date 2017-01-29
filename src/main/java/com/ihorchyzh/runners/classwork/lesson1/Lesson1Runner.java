package com.ihorchyzh.runners.classwork.lesson1;

import com.ihorchyzh.app.classwork.lesson1.NarrowingCasting;
import com.ihorchyzh.app.classwork.lesson1.WideningCasting;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class Lesson1Runner {

    public static void main(String[] args) {

        float floatNumber = 12.4f;
        System.out.println(NarrowingCasting.narrowing(floatNumber));

        int intNumber = 10;
        System.out.println(WideningCasting.widening(intNumber));

    }

}
