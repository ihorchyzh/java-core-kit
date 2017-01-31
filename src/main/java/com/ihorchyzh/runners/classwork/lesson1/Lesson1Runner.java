package com.ihorchyzh.runners.classwork.lesson1;

import com.ihorchyzh.app.classwork.lesson1.NarrowingCasting;
import com.ihorchyzh.app.classwork.lesson1.WideningCasting;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class Lesson1Runner {

    public static void main(String[] args) {

        NarrowingCasting narrowingCasting = new NarrowingCasting();
        WideningCasting wideningCasting = new WideningCasting();

        float floatNumber = 12.4f;
        System.out.println(narrowingCasting.narrowing(floatNumber));

        int intNumber = 10;
        System.out.println(wideningCasting.widening(intNumber));

    }

}
