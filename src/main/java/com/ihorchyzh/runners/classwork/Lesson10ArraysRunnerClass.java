package com.ihorchyzh.runners.classwork;

/**
 * Created by ihorchyzh on 3/12/17.
 */
public class Lesson10ArraysRunnerClass {

    public static void main(String[] args) {

        char[] charArray = {'2', '6', 'f', 'u'};
        StringBuilder stringBuilder = new StringBuilder();
        for (char value : charArray) {
            stringBuilder.append(value);
        }
        System.out.println(stringBuilder);

        char[] charArray1 = {'2', '6', 'f', 'u'};
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < charArray1.length; i++) {
            stringBuilder1.append(charArray1[i]);
        }
        System.out.println(stringBuilder.toString());

    }
}
