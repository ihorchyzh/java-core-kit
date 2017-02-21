package com.ihorchyzh.app.homework.lesson11;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Ihor Chyzh on 2/21/2017.
 */
public class InputOutputOperations {

    private final String inputArraysForSortFile = "src/main/resources/lesson11Data/inputArraysForSort.txt";
    private final String outputSortedArraysFile = "src/main/resources/lesson11Data/outputSortedArrays.txt";
    private final String isPalindromInputFile = "src/main/resources/lesson11Data/isPalindromInput.txt";
    private final String isPalindromOutputFile = "src/main/resources/lesson11Data/isPalindromOutput.txt";

//    Task 1

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(inputArraysForSortFile));
            while ((line = reader.readLine()) != null) {
                if (!line.equals(null) || !line.isEmpty())
                    sb.append(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeFile(int[] array) {
        String result = "";
        try {
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputSortedArraysFile)));
            writer.write(Arrays.toString(array));
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] stringToIntArray(String input) {
        String[] stringArray = input
                .replaceAll("[\\s|\\[|\\]|\\{|\\}]", "")
                .trim()
                .split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

//    Task 2
//      Реализовать программу, которая считывает из файла список слов в стобик,
//      и выводит в другой файл список слов и признак полиндромности
//      в виде “moom is polindrome”.

    public void isPalindromeInFile() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(isPalindromInputFile));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(isPalindromOutputFile)));
            while ((line = reader.readLine()) != null) {
                if (!line.equals(null) || !line.isEmpty()) {
                    if ((line.trim()).equalsIgnoreCase((sb.append(line).reverse()).toString())) {
                        writer.write((sb.append(" is palindrome!")).toString());
                        writer.newLine();
                    } else {
                        writer.write((new StringBuilder(line).append(" is not palindrome!")).toString());
                        writer.newLine();
                    }
                }
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}