package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson4.Choice;
import com.ihorchyzh.app.classwork.lesson4.IfStatements;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 1/26/17.
 */
public class Lesson4RunnerClass {

    public static void main(String[] args) {
        do {
            try {
                IfStatements ifStatements = new IfStatements();
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nHi! Here is an app that can perform some calculations. " +
                        "All you need it is type corresponding number and press Enter:\n\n" +
                        "A. Calculate circle area;\n" +
                        "B. Check which circle area is bigger;\n" +
                        "C. Check if you have right-angled triangle;\n" +
                        "D. Check is the number Odd or Even;\n" +
                        "E. Check which of two numbers is bigger;\n\n" +
                        "F. Exit program.\n");
                String userChoice = scanner.nextLine();
                Choice choice = Choice.valueOf(userChoice.toUpperCase());
                switch (choice) {
                    case A:
                        System.out.println("Lets calculate circle Area...?\n");
                        System.out.println("Type radius and press enter, please...");
                        double radius = scanner.nextDouble();
                        System.out.println("Area is " + ifStatements.circleArea(radius));
                        break;
                    case B:
                        System.out.println("Lets find out which circle Area is bigger...?\n");
                        System.out.println("Type the radius of the first circle and press enter");
                        double firstCircleRadius = scanner.nextDouble();
                        System.out.println("Type the radius of the second circle and press enter");
                        double secondCircleRadius = scanner.nextDouble();
                        System.out.println(ifStatements.calculateBiggerCircleArea(firstCircleRadius, secondCircleRadius));
                        break;
                    case C:
                        System.out.println("Lets find out is this right-angled triangle...?\n");
                        System.out.println("Type 3 sides of the triangle and press Enter each time");
                        double sideA = scanner.nextDouble();
                        double sideB = scanner.nextDouble();
                        double sideC = scanner.nextDouble();
                        System.out.println(ifStatements.isRightAngledTriangle(sideA, sideB, sideC));
                        break;
                    case D:
                        System.out.println("Lets find out is this number Odd or Even...?\n");
                        System.out.println("Type a number");
                        int number = (int) scanner.nextDouble();
                        System.out.println(ifStatements.evenOrOdd(number));
                        break;
                    case E:
                        System.out.println("Lets find out which number is bigger...?\n");
                        System.out.println("Type the first number and press Enter");
                        double firstNumber = scanner.nextDouble();
                        System.out.println("Type the second number and press Enter");
                        double secondNumber = scanner.nextDouble();
                        System.out.println(ifStatements.isBigger(firstNumber, secondNumber));
                        break;
                    case F:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("You entered wrong number. Required only number from the list! Try again!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("You entered incorrect symbol! Try again!");
            }
        } while (true);
    }
}