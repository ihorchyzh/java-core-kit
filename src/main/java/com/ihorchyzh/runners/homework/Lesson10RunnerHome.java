package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson10.ArrayParser;

/**
 * Created by ihorchyzh on 2/18/17.
 */
public class Lesson10RunnerHome {

    public static void main(String[] args) {
        ArrayParser arrayParser = new ArrayParser();

//        Scanner scanner = new Scanner(System.in);
//        String stringArray = scanner.nextLine();

        String test = "My name is Ihor. My brother's is Andrii.";
        System.out.println(arrayParser.replaceKeyWord(test, "is"));

//        System.out.println(arrayParser.outAnyLetters("Dasa.rf55hH!"));

//        int[] array = {2, 6, 1, 0, 5};
//        System.out.println(ArrayOperations.toString(array));
//        System.out.println(ArrayOperations.toString(arrayParser.convertStringToIntArray(stringArray, "|")));
//        System.out.println(ArrayOperations.toString(arrayParser.sortFromSmallToBig(array)));
//        System.out.println(ArrayOperations.toString(arrayParser.sortFromBigToSmall(array)));


//        Scanner scanner = new Scanner(System.in);
//        StringBuilder stringBuilder = new StringBuilder();
//
//        String stringArray = scanner.nextLine();
//
//        System.out.println(stringArray);
//
//
//        int array[] = arrayParser.convertArrayToInt(stringArray, ";");
//
//        System.out.println(ArrayOperations.toString(array));

    }

}
