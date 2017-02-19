package com.ihorchyzh.app.classwork.lesson7;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/9/17.
 */
public class Loops {

    public int[] baubleSortSmallToBig1(int[] array) {
        boolean status = true;
        do {
            status = false;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    status = true;
                }
            }
        } while (status);
        return array;
    }

    public int[] baubleSortBigToSmall1(int[] array) {
        boolean init = true;
        do {
            init = false;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    init = true;
                }
            }
        } while (init);
        return array;
    }

    public int[] baubleSortSmallToBig2(int[] array) {

        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public int[] baubleSortBigToSmall2(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public char[] charArray(int size) {
        char[] charArray = new char[size];
        for (int i = 0; i < size; i++) {
            charArray[i] = (char) i;
        }
        return charArray;
    }
}