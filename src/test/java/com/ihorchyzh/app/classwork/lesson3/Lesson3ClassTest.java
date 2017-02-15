package com.ihorchyzh.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ihorchyzh on 1/23/17.
 */
public class Lesson3ClassTest {
    public static final double DELTA = 1e-15;

    @Test
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertEquals(expRes, lesson3Class.multiply(a, b));
    }

    @Test
    public void additionTest() {
        String a = "Hi, ", b = "Ihor!", expRes = "Hi, Ihor!";
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertEquals(expRes, lesson3Class.addition(a, b));
    }

    @Test
    public void subtractionTest() {
        int a = 5, b = 4, expRes = 1;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertEquals(expRes, lesson3Class.subtraction(a, b));
    }

    @Test

    public void chooseMaxNumberTest() {
        double a = 1.1d, b = 2.2d, expRes = 2.2d;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertEquals(expRes, lesson3Class.chooseMaxNumber(a, b), DELTA);
    }

    @Test
    public void getSquareRoot() {
        double a = 25.0d, expRes = 5.0d;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertEquals(expRes, lesson3Class.getSquareRoot(a), DELTA);
    }

    @Test
    public void powerTest() {
        double a = 2.0d, b = 3.0d, expRes = 9.0d;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertNotEquals(expRes, lesson3Class.power(a, b), DELTA);
    }

    @Test
    public void isOddNumberTrueTest() {
        int number = 3;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertTrue(lesson3Class.isOddNumber(number));
    }

    @Test
    public void isOddNumberFalseTest() {
        int number = 4;
        Lesson3Class lesson3Class = new Lesson3Class();
        Assert.assertFalse(lesson3Class.isOddNumber(number));
    }

}