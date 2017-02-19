package com.ihorchyzh.runners.classwork.lesson10;

/**
 * Created by ihorchyzh on 2/16/17.
 */
public class Lesson10RunnerClass {

    public static void main(String[] args) {

//        Find all words in the string.
//        Word is usually separated by spaces.

//        System.out.println("Enter words using space as separator");
//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        String[] splittedStringArray = inputString.split(" ");
//        int countWords = 0;
//        for (int i = 0; i < splittedStringArray.length; i++) {
//            countWords++;
//        }
//        System.out.println(countWords);
//        System.out.println(ArrayOperations.toString(splittedStringArray));


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

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] cipher = "a0c8efg5ijk3mn1pq5stu6wxyz".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        String codedMessage = "";

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < cipher.length; j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)){

                }
            }
        }


    }
}