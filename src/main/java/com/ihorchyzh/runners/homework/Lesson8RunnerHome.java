package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson8.MultidimensionalArrays;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/12/17.
 */
public class Lesson8RunnerHome {

    public static void main(String[] args) {

        MultidimensionalArrays multidimensionalArrays = new MultidimensionalArrays();

//        int[] array = {4, 8, 3, 1, 7, 5, 9, 0};
//
//        System.out.println(Arrays.toString(multidimensionalArrays.selectionSort(array)));

        int rows = 5;
        int columns = 8;
        int startElement = -99;
        int endElement = 99;

        int[][] array = multidimensionalArrays.multidimensionalArray(rows, columns, startElement, endElement);

        System.out.println("\nmultidimensionalArray: " + Arrays.deepToString(array) + "\n");

        System.out.println("minMultidimensionalArrayValue: " + multidimensionalArrays.minMultidimensionalArrayValue(array) + "\n");

        System.out.println("maxMultidimensionalArrayValue: " + multidimensionalArrays.maxMultidimensionalArrayValue(array));

    }

}