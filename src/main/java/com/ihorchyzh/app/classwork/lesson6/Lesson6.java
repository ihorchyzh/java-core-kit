package com.ihorchyzh.app.classwork.lesson6;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 2/2/17.
 */
public class Lesson6 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first number");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter the second number");
//        int secondNumber = scanner.nextInt();
//
//        if (firstNumber > secondNumber) {
//            while (firstNumber != secondNumber) {
//                firstNumber--;
//                System.out.println("first number: " + firstNumber + " " + "second number: " + secondNumber);
//            }
//        } else System.out.println("first number: " + firstNumber + " " + "second number: " + secondNumber);
//
//
//        for (int i = 0; i <= 10; i++) {
//
//            System.out.print(i + " ");
//
//        }
//
//        int j = 0;
//        while (j < 11) {
//
//            System.out.print(j + " ");
//            j++;
//
//        }
//
//        int k = 0;
//        do {
//
//            System.out.print(k + " ");
//            k++;
//        } while (k <= 10);
//

//        int countEven = 0;
//
//        for (int l = 0; l < 20; l++) {
//
//            if (l % 2 == 0) {
//                countEven++;
//            }
//
//        }
//
//        System.out.println(countEven);


//        boolean[] booleanArray = {true, false, true};
//        for (int i = 0; i< booleanArray.length; i++){
//            System.out.println(booleanArray[i]);
//        }

        int[][] intArray = new int[2][3];
        for (int m = 0; m < intArray.length; m++) {
            for (int n = 0; n < intArray[m].length; n++) {
                System.out.println(intArray[m][n] = m * n);
            }
        }

    }

}