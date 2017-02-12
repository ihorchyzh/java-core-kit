package com.ihorchyzh.app.classwork.lesson7;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/9/17.
 */
public class Lesson7 {

//    public static void main(String[] args) {
//
//
//
//    }

    public int[] baubleSortSmallToBig(int[] array) {
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
