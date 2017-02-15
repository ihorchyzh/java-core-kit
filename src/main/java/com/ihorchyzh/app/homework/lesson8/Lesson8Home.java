package com.ihorchyzh.app.homework.lesson8;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by ihorchyzh on 2/12/17.
 */
public class Lesson8Home {

    ///   5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]

    public int[][] multidimensionalArray(int rows, int columns, int startElement, int endElement) {
        int[][] multidimensionalArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multidimensionalArray[i][j] = ThreadLocalRandom.current()
                        .nextInt(startElement, endElement + 1);
            }
        }
        return multidimensionalArray;
    }

    public int minMultidimensionalArrayValue(int[][] array) {
        int minimum = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minimum > array[i][j]) {
                    minimum = array[i][j];
                }
            }
        }
        return minimum;
    }

    public int maxMultidimensionalArrayValue(int[][] array) {
        int maximum = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maximum < array[i][j]) {
                    maximum = array[i][j];
                }
            }
        }
        return maximum;
    }

}