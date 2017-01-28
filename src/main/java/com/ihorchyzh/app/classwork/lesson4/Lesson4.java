package com.ihorchyzh.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 1/26/17.
 */
public class Lesson4 {

    public static final double PI = 3.14d;

    public void circleArea() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type radius and press enter");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is " + circleArea);

    }

    public void calculateBigger() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the radius of the first circle and press enter");
        double firstCircleRadius = scanner.nextDouble();
        System.out.println("Type the radius of the second circle and press enter");
        double secondCircleRadius = scanner.nextDouble();
        double firstCircleArea = PI * Math.pow(firstCircleRadius, 2);
        double secondCircleArea = PI * Math.pow(secondCircleRadius, 2);
        if (firstCircleArea > secondCircleArea) {
            System.out.println("First circle Area is bigger");
        } else {
            System.out.println("Second circle Area is bigger");
        }

    }

    public void rightTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 3 sides of the triangle");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        if (
                (Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)) ||
                        (Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2)) ||
                        (Math.pow(sideA, 2) == Math.pow(sideC, 2) + Math.pow(sideB, 2))
                ) {
            System.out.println("This is right-angled triangle!");
        } else {
            System.out.println("You have not right-angled triangle");
        }

    }

    public void evenOrOdd() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int number = (int) scanner.nextDouble();
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even");
        } else {
            System.out.println("The number " + number + " is odd");
        }

    }

}
