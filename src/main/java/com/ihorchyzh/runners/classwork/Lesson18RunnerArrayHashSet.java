package com.ihorchyzh.runners.classwork;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 3/16/17.
 */
public class Lesson18RunnerArrayHashSet {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            hashSet.add(scanner.nextLine());
        }

        System.out.println(hashSet);
        String a ="";
        a.hashCode();
    }

}
