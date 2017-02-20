package com.ihorchyzh.app.classwork.lesson10;

import java.util.Arrays;

/**
 * Created by Igor Chyzh on 2/20/2017.
 */
public class StringBuilderOperations {

    public String countWordsForLoop(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] splittedStringArray = input.trim().split("\\s+");
        int countWords = 0;
        for (int i = 0; i < splittedStringArray.length; i++) {
            countWords++;
        }
        stringBuilder
                .append("You entered: ").append(Arrays.toString(splittedStringArray) + "\n")
                .append("There are: ").append(Integer.toString(countWords)).append(" elements.");
        return stringBuilder.toString();
    }

    public String countWordsStringLength(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = input.trim().split("\\s+").length;
        stringBuilder
                .append("Count of words: ").append(Integer.toString(counter)).append("\n")
                .append("Sentence is: ").append(input.trim());
        return stringBuilder.toString();
    }

    public int countWordsChatAt(String input) {
        int counter = 0;
        char[] chars = input.toCharArray();
        for (char ch : chars) {
            if (Character.isAlphabetic(input.charAt(ch))) {
                counter++;
            }
        }
        return counter;
    }

//        MEASURE STRING PERFORMANCE
//        long start = System.currentTimeMillis();
//        String c = "start";
//        String b = "finish";
//        for (long i = 0; i < 10000L; i++) {
//            c = c.concat(b);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


//        MEASURE STRING BUILDER PERFORMANCE
//        long start = System.currentTimeMillis();
//        StringBuilder c = new StringBuilder("start");
//        String b = "finish";
//        for (long i = 0; i < 10000L; i++) {
//            c = c.append(b);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

//        char[] charArray = {'2','6','f','u'};
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char value: charArray) {
//            stringBuilder.append(value);
//        }
//        System.out.println(stringBuilder);

//        char[] charArray = {'2', '6', 'f', 'u'};
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < charArray.length; i++) {
//            stringBuilder.append(charArray[i]);
//        }
//        System.out.println(stringBuilder.toString());

//    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//    char[] cipher = "a0c8efg5ijk3mn1pq5stu6wxyz".toCharArray();
//    StringBuilder stringBuilder = new StringBuilder();
//    String codedMessage = "";
//
//        for (int i = 0; i < alphabet.length; i++) {
//        for (int j = 0; j < cipher.length; j++) {
//            if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
//
//            }

}