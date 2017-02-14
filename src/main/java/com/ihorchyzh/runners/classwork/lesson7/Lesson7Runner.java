package com.ihorchyzh.runners.classwork.lesson7;

import com.ihorchyzh.app.classwork.lesson7.Lesson7;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/9/17.
 */
public class Lesson7Runner {

    public static void main(String[] args) {

        Lesson7 lesson7 = new Lesson7();

        int[] array = {5, 1, 3, 2, 4};
        int arraySize = 80;

        System.out.println("baubleSortSmallToBig ver 1\n" +
                Arrays.toString(lesson7.baubleSortSmallToBig1(array)) + "\n");
        System.out.println("baubleSortBigToSmall ver 1\n" +
                Arrays.toString(lesson7.baubleSortBigToSmall1(array)) + "\n");
        System.out.println("baubleSortSmallToBig ver 2\n" +
                Arrays.toString(lesson7.baubleSortSmallToBig2(array)) + "\n");
        System.out.println("baubleSortBigToSmall ver 2\n" +
                Arrays.toString(lesson7.baubleSortBigToSmall2(array)) + "\n");
        System.out.println("standardSort\n" +
                Arrays.toString(lesson7.sortArray(array)) + "\n");
        System.out.println("outCharArray\n" +
                Arrays.toString(lesson7.charArray(arraySize)));
    }

}
