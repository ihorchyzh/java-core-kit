package com.ihorchyzh.app.homework.lesson11;

import java.io.*;

/**
 * Created by Igor Chyzh on 2/21/2017.
 */
public class InputOutputOperations {

    private final String inputArraysForSortFile = "src\\test\\resources\\lesson11Data\\inputArraysForSort.txt";
    private final String outputSortedArraysFile = "src\\test\\resources\\lesson11Data\\outputSortedArrays.txt";

    public String readFile() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(inputArraysForSortFile));
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.append(line).toString();
    }

    public void writeFile(int[] array) {
        String result = "";
        try {
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(outputSortedArraysFile)));
            writer.append(result);
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
                .replaceAll("[\\s+|\\[|\\]|\\{|\\}]", "")
                .trim()
                .split(",");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

}