package com.ihorchyzh.app.homework.lesson10;

/**
 * Created by ihorchyzh on 2/18/17.
 */
public class ArrayParser {

    public int[] convertStringToIntArray(String input, String splitSymbol) {
        String[] formattedInput = input
//  TODO Why in this reg exp "," in \\s,\\[ is not like the split symbol?
// .replaceAll("[\\s,\\[,\\],\\{,\\}]", "")
                .replaceAll("\\s", "")
                .replaceAll("\\[", "")
                .replaceAll("\\]", "")
                .replaceAll("\\{", "")
                .replaceAll("\\}", "")
                .trim()
                .replaceAll("[splitSymbol,&,%,^,:,;,*,?,/,#,№,!,@,_,+,$,(,),~,|,{,},[,],>,<,.,-,±,§]", ",")
                .split(",");
        int[] array = new int[formattedInput.length];
        for (int i = 0; i < formattedInput.length; i++) {
            array[i] = Integer.valueOf(formattedInput[i]);
        }
        return array;
    }

    public int[] sortFromSmallToBig(int[] array) {
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

    public int[] sortFromBigToSmall(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    public String outAnyLetters(String input) {
        String result = input.replaceAll("[^A-Za-z]+", "");
        return result;
    }

    public String replaceKeyWord(String input, String keyWord) {
        String result = "";
        if (input.contains(keyWord)) {
            result = input.replace(keyWord, "\n");
        } else {
            result = input;
        }
        return result;
    }

}
