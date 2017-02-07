package com.ihorchyzh.app.classwork.lesson3;

/**
 * Created by ihorchyzh on 1/23/17.
 */

public class MathFunctions {

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public String addition(String a, String b) {
        String result = a + b;
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public double chooseMaxNumber(double a, double b) {
        double result = Math.max(a, b);
        return result;
    }

    public double getSquareRoot(double a) {
        double result = Math.sqrt(a);
        return result;
    }

    public double power(double a, double b) {
        double result = Math.pow(a, b);
        return result;
    }

    public boolean isOddNumber(int number) {
        boolean result;
        if (number % 2 > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}