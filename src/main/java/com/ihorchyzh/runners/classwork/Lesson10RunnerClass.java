package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson10.StringBuilderOperations;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/16/17.
 */
public class Lesson10RunnerClass {

    public static void main(String[] args) {
        StringBuilderOperations stringBuilderOperations = new StringBuilderOperations();
        System.out.println("Enter words using space as separator");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        System.out.println(stringBuilderOperations.countWordsChatAt(inputString));

    }
}