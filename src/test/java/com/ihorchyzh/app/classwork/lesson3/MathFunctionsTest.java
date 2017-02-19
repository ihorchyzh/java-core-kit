package com.ihorchyzh.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ihorchyzh on 1/23/17.
 */
public class MathFunctionsTest {
    public static final double DELTA = 1e-15;

    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertEquals(expRes, mathFunctions.multiply(a, b));
    }

    @Test
    public void additionTest() {
        String a = "Hi, ", b = "Ihor!", expRes = "Hi, Ihor!";
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertEquals(expRes, mathFunctions.addition(a, b));
    }

    @Test
    public void subtractionTest() {
        int a = 5, b = 4, expRes = 1;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertEquals(expRes, mathFunctions.subtraction(a, b));
    }

    @Test

    public void chooseMaxNumberTest() {
        double a = 1.1d, b = 2.2d, expRes = 2.2d;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertEquals(expRes, mathFunctions.chooseMaxNumber(a, b), DELTA);
    }

    @Test
    public void getSquareRoot() {
        double a = 25.0d, expRes = 5.0d;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertEquals(expRes, mathFunctions.getSquareRoot(a), DELTA);
    }

    @Test
    public void powerTest() {
        double a = 2.0d, b = 3.0d, expRes = 9.0d;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertNotEquals(expRes, mathFunctions.power(a, b), DELTA);
    }

    @Test
    public void isOddNumberTrueTest() {
        int number = 3;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertTrue(mathFunctions.isOddNumber(number));
    }

    @Test
    public void isOddNumberFalseTest() {
        int number = 4;
        MathFunctions mathFunctions = new MathFunctions();
        Assert.assertFalse(mathFunctions.isOddNumber(number));
    }

}