package com.ihorchyzh.runners.homework.lesson9;

import com.ihorchyzh.app.homework.lesson9.Palindrome;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/14/17.
 */
public class Lesson9RunnerHome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        choose(scanner);
    }

    private static void menu(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder
                .append("\nHi! Here is an app that can verify if entered word is palindrome!")
                .append("\nType some word and press Enter in the end.")
                .append("\n\nBut if you want to quit you should type \"exit\" and press Enter"));
        String userInput = scanner.nextLine();
        if (userInput.equals("exit")) {
            System.exit(0);
        }
    }

    private static void choose(Scanner scanner) {
        Palindrome palindrome = new Palindrome();
        System.out.println("Now choose one of the 5 methods to verify.");
        try {
            String userInput = scanner.nextLine();
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println(palindrome.palindromeCharAtMethod(userInput));
                    break;
                case 2:
                    char[] charArray = userInput.toCharArray();
                    System.out.println(palindrome.palindromeToLowerCaseMethod(charArray));
                    break;
                case 3:
                    System.out.println(palindrome.palindromeReverseMethod(userInput));
                    break;
                case 4:
                    System.out.println(palindrome.palindromeEqualsIgnoreMethod(userInput));
                    break;
                case 5:
                    System.out.println(palindrome.palindromeReverseCharAtMethod(userInput));
                    break;
                default:
                    System.out.println("Wrong input. Try number from 1 to 5!");
            }
            menu(scanner);
            choose(scanner);
        } catch (InputMismatchException e) {
            System.out.println("Only numbers required! Try again.");
            choose(scanner);
        }
    }

}