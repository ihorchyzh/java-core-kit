package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson6.ArrayFormat;
import com.ihorchyzh.app.homework.lesson6.Menu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/5/17.
 */
public class Lesson6RunnerHome {

    private static final int START_NUMBER_OF_EVEN_ARRAY = 2;
    private static final int END_NUMBER_OF_EVEN_ARRAY = 20;
    private static final int START_NUMBER_OF_ODD_ARRAY = 1;
    private static final int END_NUMBER_OF_ODD_ARRAY = 99;
    private static final int RANDOM_GENERATED_ARRAY_LENGTH = 15;
    private static final int START_NUMBER_OF_SEGMENT_TASK_2C = 0;
    private static final int END_NUMBER_OF_SEGMENT_TASK_2C = 9;
    private static final int START_NUMBER_OF_SEGMENT_TASK_2D = 0;
    private static final int END_NUMBER_OF_SEGMENT_TASK_2D = 999;
    private static final int MULTI_DIMENSIONAL_ARRAY_COLUMNS = 8;
    private static final int MULTI_DIMENSIONAL_ARRAY_ROWS = 5;
    private static final int START_NUMBER_OF_SEGMENT_TASK_2E = 10;
    private static final int END_NUMBER_OF_SEGMENT_TASK_2E = 99;
    private static final int START_NUMBER_OF_SEGMENT_TASK_2F = 1;
    private static final int END_NUMBER_OF_SEGMENT_TASK_2F = 999;


    public static void main(String[] args) {
        boolean exit = false;
        do {
            try {

                ArrayFormat arrayFormat = new ArrayFormat();
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nHi! Here is an app that can perform some actions with arrays. " +
                        "All you need it is type corresponding number and press Enter:\n\n" +
                        "A. Out array in horizontal and vertical line;\n" +
                        "B. Out normal and reversed array;\n" +
                        "C. Generate random array and out quantity of even numbers in it;\n" +
                        "D. Generate random array and out maximum number in it;\n" +
                        "E. Generate array 8x5 and out the array;\n" +
                        "F. Generate array 8x5 and out the formatted array;\n" +
                        "G. Exit program.\n");
                String userChoice = scanner.nextLine();
                Menu menu = Menu.valueOf(userChoice.toUpperCase());
                switch (menu) {
                    case A:
                        int evenArrayLength = arrayFormat.evenArrayLengthCount(
                                START_NUMBER_OF_EVEN_ARRAY, END_NUMBER_OF_EVEN_ARRAY
                        );
                        int[] evenArray = arrayFormat.evenArrayElementOut(evenArrayLength);
                        System.out.println(arrayFormat.formattedHorizontalArray(evenArray) + "\n");
                        System.out.println(arrayFormat.formattedVerticalArray(evenArray));
                        break;
                    case B:
                        int oddArrayLength = arrayFormat.oddArrayLengthCount(
                                START_NUMBER_OF_ODD_ARRAY, END_NUMBER_OF_ODD_ARRAY
                        );
                        int[] oddArray = arrayFormat.oddArrayElementOut(oddArrayLength);
                        System.out.println(arrayFormat.formattedHorizontalArray(oddArray));
                        int[] oddArrayReverse = arrayFormat.reverseArray(oddArray);
                        System.out.println(arrayFormat.formattedHorizontalArray(oddArrayReverse));
                        break;
                    case C:
                        int[] randomGeneratedArray2C = arrayFormat.randomGeneratedArray2C(
                                RANDOM_GENERATED_ARRAY_LENGTH, START_NUMBER_OF_SEGMENT_TASK_2C,
                                END_NUMBER_OF_SEGMENT_TASK_2C
                        );
                        System.out.println(Arrays.toString(randomGeneratedArray2C));
                        System.out.println("\n There are " +
                                arrayFormat.countOfEvenNumbersInArray(randomGeneratedArray2C) +
                                " even numbers in the array.");
                        break;
                    case D:
                        int[] randomGeneratedArray2D = arrayFormat.randomGeneratedArray2D(
                                RANDOM_GENERATED_ARRAY_LENGTH, START_NUMBER_OF_SEGMENT_TASK_2D,
                                END_NUMBER_OF_SEGMENT_TASK_2D
                        );
                        System.out.println(Arrays.toString(randomGeneratedArray2D));
                        System.out.println("\nThe maximum number in array is " +
                                arrayFormat.maxNumberInArray(randomGeneratedArray2D));
                        System.out.println("\nThe minimum number in array is " +
                                arrayFormat.minNumberInArray(randomGeneratedArray2D));
                        break;
                    case E:
                        int[][] multiDimensionalArray = arrayFormat.multiDimensionalArray(
                                MULTI_DIMENSIONAL_ARRAY_COLUMNS, MULTI_DIMENSIONAL_ARRAY_ROWS,
                                START_NUMBER_OF_SEGMENT_TASK_2E, END_NUMBER_OF_SEGMENT_TASK_2E
                        );
                        String multiDimensionalArrayString = arrayFormat.formattedVerticalMultiDimensionalArray(multiDimensionalArray);
                        System.out.println(multiDimensionalArrayString);
                        break;
                    case F:
                        int[][] multiDimensionalArrayFormatted = arrayFormat.multiDimensionalArray(
                                MULTI_DIMENSIONAL_ARRAY_COLUMNS, MULTI_DIMENSIONAL_ARRAY_ROWS,
                                START_NUMBER_OF_SEGMENT_TASK_2F, END_NUMBER_OF_SEGMENT_TASK_2F
                        );
                        String multiDimensionalArrayFormattedString = arrayFormat.formattedVerticalMultiDimensionalArray(multiDimensionalArrayFormatted);
                        System.out.printf("%4s", multiDimensionalArrayFormattedString);
                        break;
                    case G:
                        exit = true;
                        break;
                    default:
                        System.out.println("You entered wrong number. Required only number from the list! Try again!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("You entered incorrect symbol! Try again!");
            }
        } while (exit != true);
    }
}