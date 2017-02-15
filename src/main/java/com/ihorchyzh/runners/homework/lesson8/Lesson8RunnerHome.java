package com.ihorchyzh.runners.homework.lesson8;

import com.ihorchyzh.app.homework.lesson8.Lesson8Home;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/12/17.
 */
public class Lesson8RunnerHome {

    public static void main(String[] args) {

        Lesson8Home lesson8Home = new Lesson8Home();

//        int[] array = {4, 8, 3, 1, 7, 5, 9, 0};
//
//        System.out.println(Arrays.toString(lesson8Home.selectionSort(array)));

        int rows = 5;
        int columns = 8;
        int startElement = -99;
        int endElement = 99;

        int[][] array = lesson8Home.multidimensionalArray(rows, columns, startElement, endElement);

        System.out.println("\nmultidimensionalArray: " + Arrays.deepToString(array) + "\n");

        System.out.println("minMultidimensionalArrayValue: " + lesson8Home.minMultidimensionalArrayValue(array) + "\n");

        System.out.println("maxMultidimensionalArrayValue: " + lesson8Home.maxMultidimensionalArrayValue(array));

    }

}