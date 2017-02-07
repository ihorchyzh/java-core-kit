package com.ihorchyzh.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 1/26/17.
 */
public class Lesson4 {

    public static final double PI = 3.14d;

    public double circleArea(double radius) {
        double circleArea = PI * Math.pow(radius, 2);
        return circleArea;
    }

    public String calculateBiggerCircleArea(double firstCircleRadius, double secondCircleRadius) {
        double firstCircleArea = PI * Math.pow(firstCircleRadius, 2);
        double secondCircleArea = PI * Math.pow(secondCircleRadius, 2);
        if (firstCircleArea >= secondCircleArea) {
            if (firstCircleArea == secondCircleArea) {
                return "Circle Areas are equal";
            } else {
                return "First circle Area is bigger";
            }
        } else {
            return "Second circle Area is bigger";
        }
    }

    public String isRightAngledTriangle(double sideA, double sideB, double sideC) {
        if ((Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2)) ||
                (Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2)) ||
                (Math.pow(sideA, 2) == Math.pow(sideC, 2) + Math.pow(sideB, 2))) {
            return "This is right-angled triangle!";
        } else {
            return "You have not right-angled triangle";
        }
    }

    public String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "The number is even";
        } else {
            return "The number is odd";
        }
    }

    public String isBigger(double firstNumber, double secondNumber) {
        if (firstNumber == secondNumber) {
            return "Numbers are equal";
        } else {
            if (firstNumber > secondNumber) {
                return "The first number is bigger";
            } else {
                return "The second number is bigger";
            }
        }
    }
}