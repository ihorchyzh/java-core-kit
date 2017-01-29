package com.ihorchyzh.runners.classwork.lesson4;

import com.ihorchyzh.app.classwork.lesson4.Lesson4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 1/26/17.
 */
public class Lesson4Runner {

    public static void main(String[] args) {

        try {
            do {
                Lesson4 lesson4 = new Lesson4();
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nHi! Here is an app that can perform some calculations. " +
                        "All you need it is type corresponding number and press Enter:\n\n" +
                        "1. Calculate circle area;\n" +
                        "2. Check which circle area is bigger;\n" +
                        "3. Check if you have right-angled triangle;\n" +
                        "4. Check is the number Odd or Even;\n" +
                        "5. Check which of two numbers is bigger;\n\n" +
                        "6. Exit program.\n");
                int userChoice = scanner.nextInt();
                if (!((userChoice == 1) || (userChoice == 2) || (userChoice == 3) ||
                        (userChoice == 4) || (userChoice == 5) || (userChoice == 6))) {
                    System.out.println("You entered wrong number. Required only number from the list! Try again!");
                }
                if (userChoice == 1) {

                    System.out.println("Lets calculate circle Area...?\n");
                    System.out.println("Type radius and press enter, please...");
                    double radius = scanner.nextDouble();
                    System.out.println("Area is " + lesson4.circleArea(radius));

                }
                if (userChoice == 2) {

                    System.out.println("Lets find out which circle Area is bigger...?\n");
                    System.out.println("Type the radius of the first circle and press enter");
                    double firstCircleRadius = scanner.nextDouble();
                    System.out.println("Type the radius of the second circle and press enter");
                    double secondCircleRadius = scanner.nextDouble();
                    System.out.println(lesson4.calculateBiggerCircleArea(firstCircleRadius, secondCircleRadius));

                }
                if (userChoice == 3) {

                    System.out.println("Lets find out is this right-angled triangle...?\n");
                    System.out.println("Type 3 sides of the triangle and press Enter each time");
                    double sideA = scanner.nextDouble();
                    double sideB = scanner.nextDouble();
                    double sideC = scanner.nextDouble();
                    System.out.println(lesson4.rightAngledTriangle(sideA, sideB, sideC));

                }
                if (userChoice == 4) {

                    System.out.println("Lets find out is this number Odd or Even...?\n");
                    System.out.println("Type a number");
                    int number = (int) scanner.nextDouble();
                    System.out.println(lesson4.evenOrOdd(number));

                }
                if (userChoice == 5) {

                    System.out.println("Lets find out which number is bigger...?\n");
                    System.out.println("Type the first number and press Enter");
                    double firstNumber = scanner.nextDouble();
                    System.out.println("Type the second number and press Enter");
                    double secondNumber = scanner.nextDouble();
                    System.out.println(lesson4.isBigger(firstNumber, secondNumber));

                }
                if (userChoice == 6) {
                    break;
                }
            } while (true);

        } catch (InputMismatchException e) {
            System.out.println("You entered incorrect symbol! Try again!");
        }

    }

}
