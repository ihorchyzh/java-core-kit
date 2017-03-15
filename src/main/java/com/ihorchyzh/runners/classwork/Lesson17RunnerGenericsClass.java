package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson17.ArraySorterGenerics;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 3/13/17.
 */
public class Lesson17RunnerGenericsClass {

    public static void main(String[] args) {

        Integer[] intArray = {4, 5, 6, 2, 4, 1, 0};
        Double[] doubleArray = {6.7, 4.0, 4.3, 21.7, 2.3, 4.1, 4.6, 5.9};

        ArraySorterGenerics<Integer> arrInt = new ArraySorterGenerics<>(intArray);
        ArraySorterGenerics<Double> arrDouble = new ArraySorterGenerics<>(doubleArray);

        System.out.println(Arrays.toString(arrInt.sortFromSmallToBig(intArray)));
        System.out.println(Arrays.toString(arrDouble.sortFromSmallToBig(doubleArray)));

    }

}