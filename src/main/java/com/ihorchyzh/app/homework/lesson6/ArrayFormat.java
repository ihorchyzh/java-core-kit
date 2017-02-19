package com.ihorchyzh.app.homework.lesson6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by ihorchyzh on 2/3/17.
 */
public class ArrayFormat {

//  TASK 1. Count arrays length

    public int evenArrayLengthCount(int startNumber, int endNumber) {
        int evenArrayLength = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                evenArrayLength++;
            }
        }
        return evenArrayLength;
    }

    public int oddArrayLengthCount(int startNumber, int endNumber) {
        int oddArrayLength = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 != 0) {
                oddArrayLength++;
            }
        }
        return oddArrayLength;
    }

//  TASK 2A. Out array 2..20

    public int[] evenArrayElementOut(int arrayLength) {
        int[] evenArray = new int[arrayLength];
        for (int j = 0; j < evenArray.length; j++) {
            evenArray[j] = (j + 1) * 2;
        }
        return evenArray;
    }

// TASK 2A. Out horizontal array

    public String formattedHorizontalArray(int[] array) {
        String formattedHorizontalArray = Arrays.toString(array)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        return formattedHorizontalArray;
    }

// TASK 2A. Out vertical array

    public String formattedVerticalArray(int[] array) {
        String formattedVerticalArray = Arrays.toString(array)
                .replace(" ", "")
                .replace(",", "\n")
                .replace("[", "")
                .replace("]", "")
                .trim();
        return formattedVerticalArray;
    }

//  TASK 2B. Out array 1..99

    public int[] oddArrayElementOut(int arrayLength) {
        int[] oddArray = new int[arrayLength];
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = i * 2 + 1;
        }
        return oddArray;
    }

//  TASK 2B. Out array reverse array 99..1

    public int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

//  TASK 2C. Generate random array and count even numbers in array.

    public int[] randomGeneratedArray2C(int randomArrayLength, int startOfSegment, int endOfSegment) {
        int[] randomGeneratedArray = new int[randomArrayLength];
        for (int i = 0; i < randomGeneratedArray.length; i++) {
            randomGeneratedArray[i] = ThreadLocalRandom.current()
                    .nextInt(startOfSegment, endOfSegment + 1);
        }
        return randomGeneratedArray;
    }

    public int countOfEvenNumbersInArray(int[] array) {
        int countOfEvenNumbersInArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNumbersInArray++;
            }
        }
        return countOfEvenNumbersInArray;
    }

//  TASK 2D. Generate random array and out min and max numbers in array.

    public int[] randomGeneratedArray2D(int randomArrayLength, int startOfSegment, int endOfSegment) {
        int[] randomGeneratedArray = new int[randomArrayLength];
        for (int i = 0; i < randomGeneratedArray.length; i++) {
            randomGeneratedArray[i] = ThreadLocalRandom.current()
                    .nextInt(startOfSegment, endOfSegment + 1);
        }
        return randomGeneratedArray;
    }

    public int maxNumberInArray(int[] array) {
        int maxNumberInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumberInArray) {
                maxNumberInArray = array[i];
            }
        }
        return maxNumberInArray;
    }

    public int minNumberInArray(int[] array) {
        int minNumberInArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumberInArray) {
                minNumberInArray = array[i];
            }
        }
        return minNumberInArray;
    }

//  TASK 2E. Generate array 8x5 and out the array.

    public int[][] multiDimensionalArray(int columns, int rows, int startOfSegment, int endOfSegment) {

        int[][] multiDimensionalArray = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                multiDimensionalArray[i][j] = ThreadLocalRandom.current()
                        .nextInt(startOfSegment, endOfSegment + 1);
            }
        }
        return multiDimensionalArray;
    }

    public String formattedVerticalMultiDimensionalArray(int[][] array) {
        String formattedVerticalMultiDimensionalArray = Arrays.deepToString(array)
                .replace("], [", "\n")
                .replace("[[", "")
                .replace("]]", "")
                .trim();
        return formattedVerticalMultiDimensionalArray;
    }

//  TASK 2G. Generate array 8x5 and out the printed array.


}