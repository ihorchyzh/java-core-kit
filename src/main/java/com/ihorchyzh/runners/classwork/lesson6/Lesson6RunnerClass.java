package com.ihorchyzh.runners.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/6/17.
 */
public class Lesson6RunnerClass {

    public static void main(String[] args) {

        Lesson6RunnerClass.comparingTwoNumbers();
        System.out.println("\n");
        Lesson6RunnerClass.countTenNumbers();
        System.out.println("\n");
        Lesson6RunnerClass.outputIncrement();
        System.out.println("\n");
        Lesson6RunnerClass.countEvenNumbers();

    }

    public static void comparingTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();
        if (a > b) {
            while (a != b) {
                a--;
                System.out.println("Your a is " + a + " " + "your b is " + b);
            }
        } else {
            System.out.println("Your a is " + a + " " + "your b is " + b);
        }
    }

    public static void countTenNumbers() {
        System.out.print("Here are 10 numbers: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
    }

    public static void outputIncrement() {
        int a = 1;
        System.out.println("Original a value " + a);
        System.out.println("Post-increment a " + a++);
        System.out.println("After post-increment " + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment " + a);
    }

    public static void countEvenNumbers() {
        int countEven = 0;
        for (int i = 0; i <= 20; i += 2) {
            if (i % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("There are " + countEven + " even numbers.");
    }
}