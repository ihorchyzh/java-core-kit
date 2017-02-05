package com.ihorchyzh.runners.homework.lesson6;

import com.ihorchyzh.app.homework.lesson6.LoopsArrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/5/17.
 */
public class LoopsArraysRunner {

    public static final int START_NUMBER_OF_EVEN_ARRAY = 2;
    public static final int END_NUMBER_OF_EVEN_ARRAY = 20;
    public static final int START_NUMBER_OF_ODD_ARRAY = 1;
    public static final int END_NUMBER_OF_ODD_ARRAY = 99;
    public static final int RANDOM_GENERATED_ARRAY_LENGTH = 15;
    public static final int START_NUMBER_OF_SEGMENT_TASK_2C = 0;
    public static final int END_NUMBER_OF_SEGMENT_TASK_2C = 9;
    public static final int START_NUMBER_OF_SEGMENT_TASK_2D = 0;
    public static final int END_NUMBER_OF_SEGMENT_TASK_2D = 999;
    public static final int START_NUMBER_OF_SEGMENT_TASK_2E = 10;
    public static final int END_NUMBER_OF_SEGMENT_TASK_2E = 99;
    public static final int MULTI_DIMENSIONAL_ARRAY_COLUMNS = 8;
    public static final int MULTI_DIMENSIONAL_ARRAY_ROWS = 5;

    public static void main(String[] args) {

        boolean exit = false;
        try {
            do {
                LoopsArrays loopsArrays = new LoopsArrays();
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nHi! Here is an app that can perform some actions with arrays. " +
                        "All you need it is type corresponding number and press Enter:\n\n" +
                        "1. Out array in horizontal and vertical line;\n" +
                        "2. Out normal and reversed array;\n" +
                        "3. Generate random array and out quantity of even numbers in it;\n" +
                        "4. Generate random array and out maximum number in it;\n" +
                        "5. Generate array 8x5 and out the array;\n\n" +
                        "6. Exit program.\n");
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        int evenArrayLength = loopsArrays.evenArrayLengthCount();
                        int[] evenArray = loopsArrays.evenArrayElementOut(evenArrayLength);
                        System.out.println(loopsArrays.formattedHorizontalArray(evenArray));
                        System.out.println(loopsArrays.formattedVerticalArray(evenArray));
                        break;
                    case 2:
                        int oddArrayLength = loopsArrays.oddArrayLengthCount();
                        int[] oddArray = loopsArrays.oddArrayElementOut(oddArrayLength);
                        int[] oddArrayReverse = loopsArrays.reverseArray(oddArray);
                        System.out.println(Arrays.toString(oddArray));
                        System.out.println(Arrays.toString(oddArrayReverse));
                        break;
                    case 3:
                        int[] randomGeneratedArray2C = loopsArrays.randomGeneratedArray2C();
                        System.out.println(Arrays.toString(randomGeneratedArray2C));
                        System.out.println("\n There are " +
                                loopsArrays.countOfEvenNumbersInArray(randomGeneratedArray2C) +
                                " even numbers in the array.");
                        break;
                    case 4:
                        int[] randomGeneratedArray2D = loopsArrays.randomGeneratedArray2D();
                        System.out.println(Arrays.toString(randomGeneratedArray2D));
                        System.out.println("\nThe maximum number in array is " +
                                loopsArrays.maxNumberInArray(randomGeneratedArray2D));
                        System.out.println("\nThe minimum number in array is " +
                                loopsArrays.minNumberInArray(randomGeneratedArray2D));
                    case 5:
                        int[][] multiDimensionalArray = loopsArrays.multiDimensionalArray();
                        String multiDimensionalArrayString = loopsArrays.formattedVerticalMultiDimensionalArray(multiDimensionalArray);
                        System.out.println(multiDimensionalArrayString);
                        break;
                    case 6:
                        exit = true;
                        break;
                }
            } while (exit != true);
        } catch (InputMismatchException e) {
            System.out.println("You entered incorrect symbol! Try again!");
        }
    }
}