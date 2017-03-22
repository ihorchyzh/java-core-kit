package com.ihorchyzh.runners.classwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 3/16/17.
 */
public class Lesson18RunnerArrayListClass {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            myList.add(scanner.nextLine());

        }

        System.out.println(myList);

    }

}
