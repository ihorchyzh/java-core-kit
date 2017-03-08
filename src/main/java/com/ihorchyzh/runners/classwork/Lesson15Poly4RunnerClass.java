package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15poly4.WoodEquals;

/**
 * Created by ihorchyzh on 3/6/17.
 */
public class Lesson15Poly4RunnerClass {

    public static void main(String[] args) {

        WoodEquals woodEquals = new WoodEquals();
        WoodEquals woodEquals1 = new WoodEquals();

        woodEquals.setQuantity(4);
        woodEquals1.setQuantity(5);

//        woodEquals.setQuantity(2);
//        woodEquals1.setQuantity(2);

        System.out.println(woodEquals.equals(woodEquals1));

    }

}