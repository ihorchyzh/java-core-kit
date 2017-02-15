package com.ihorchyzh.runners.classwork.lesson1;

import com.ihorchyzh.app.classwork.lesson1.Lesson1Class;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class Lesson1RunnerClass {

    public static void main(String[] args) {

        Lesson1Class lesson1Class = new Lesson1Class();

        float floatNumber = 12.4f;
        System.out.println(lesson1Class.narrowing(floatNumber));

        int intNumber = 10;
        System.out.println(lesson1Class.widening(intNumber));

    }

}