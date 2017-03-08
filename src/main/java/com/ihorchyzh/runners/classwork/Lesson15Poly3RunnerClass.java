package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15poly3.MethodOverloading;

/**
 * Created by ihorchyzh on 3/8/17.
 */
public class Lesson15Poly3RunnerClass {

    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();

        methodOverloading.out();
        methodOverloading.out('c');
        methodOverloading.out('c', 7);
        methodOverloading.out(7, 'c');

    }

}
