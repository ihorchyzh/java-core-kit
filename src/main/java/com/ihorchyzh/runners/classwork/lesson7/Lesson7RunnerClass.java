package com.ihorchyzh.runners.classwork.lesson7;

import com.ihorchyzh.app.classwork.lesson7.Loops;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/9/17.
 */
public class Lesson7RunnerClass {

    public static void main(String[] args) {

        Loops loops = new Loops();

        int[] array = {5, 1, 3, 2, 4};
        int arraySize = 80;

        System.out.println("baubleSortSmallToBig ver 1\n" +
                Arrays.toString(loops.baubleSortSmallToBig1(array)) + "\n");
        System.out.println("baubleSortBigToSmall ver 1\n" +
                Arrays.toString(loops.baubleSortBigToSmall1(array)) + "\n");
        System.out.println("baubleSortSmallToBig ver 2\n" +
                Arrays.toString(loops.baubleSortSmallToBig2(array)) + "\n");
        System.out.println("baubleSortBigToSmall ver 2\n" +
                Arrays.toString(loops.baubleSortBigToSmall2(array)) + "\n");
        System.out.println("standardSort\n" +
                Arrays.toString(loops.sortArray(array)) + "\n");
        System.out.println("outCharArray\n" +
                Arrays.toString(loops.charArray(arraySize)));
    }

}
