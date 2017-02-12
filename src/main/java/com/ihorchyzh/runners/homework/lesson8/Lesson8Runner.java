package com.ihorchyzh.runners.homework.lesson8;

import com.ihorchyzh.app.homework.lesson8.Lesson8;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/12/17.
 */
public class Lesson8Runner {

    public static void main(String[] args) {

        Lesson8 lesson8 = new Lesson8();

//        int[] array = {4, 8, 3, 1, 7, 5, 9, 0};
//
//        System.out.println(Arrays.toString(lesson8.selectionSort(array)));

        int rows = 5;
        int columns = 8;
        int startElement = -99;
        int endElement = 99;

        int[][] array = lesson8.multidimensionalArray(rows, columns, startElement, endElement);

        System.out.println("\nmultidimensionalArray: " + Arrays.deepToString(array) + "\n");

        System.out.println("minMultidimensionalArrayValue: " + lesson8.minMultidimensionalArrayValue(array) + "\n");

        System.out.println("maxMultidimensionalArrayValue: " + lesson8.maxMultidimensionalArrayValue(array));

    }


}
