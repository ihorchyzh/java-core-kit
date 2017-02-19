package com.ihorchyzh.runners.classwork.lesson9;

import com.ihorchyzh.app.homework.lesson6.ArrayFormat;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/15/17.
 */
public class TestRunner {

    public static void main(String[] args) {

        ArrayFormat arrayFormat = new ArrayFormat();

        int[][] array = arrayFormat.multiDimensionalArray(5, 8, 1, 999);

        System.out.println(Arrays.deepToString(array));


    }

}
