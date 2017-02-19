package com.ihorchyzh.app.classwork.lesson4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 1/31/17.
 */
public class IfStatementsTest {
    IfStatements ifStatements;

    @Before
    public void setUp() throws Exception {
        ifStatements = new IfStatements();
    }

    @Test
    public void circleAreaTest() throws Exception {
        double radius = 2;
        double expResult = 12.56;
        double delta = 0.01;
        Assert.assertEquals(expResult, ifStatements.circleArea(radius), delta);
    }

    @Test
    public void calculateBiggerCircleAreaEqualTest() throws Exception {
        double firstCircleArea = 2;
        double secondCircleArea = 2;
        String expResult = "Circle Areas are equal";
        Assert.assertEquals(expResult, ifStatements.calculateBiggerCircleArea(firstCircleArea, secondCircleArea));
    }

    @Test
    public void calculateBiggerCircleAreaFirstIsBiggerTest() throws Exception {
        double firstCircleArea = 4;
        double secondCircleArea = 2;
        String expResult = "First circle Area is bigger";
        Assert.assertEquals(expResult, ifStatements.calculateBiggerCircleArea(firstCircleArea, secondCircleArea));
    }

    @Test
    public void calculateBiggerCircleAreaSecondIsBiggerTest() throws Exception {
        double firstCircleArea = 2;
        double secondCircleArea = 4;
        String expResult = "Second circle Area is bigger";
        Assert.assertEquals(expResult, ifStatements.calculateBiggerCircleArea(firstCircleArea, secondCircleArea));
    }

    @Test
    public void isRightAngledTriangleTrue1Test() throws Exception {
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;
        String expResult = "This is right-angled triangle!";
        Assert.assertEquals(expResult, ifStatements.isRightAngledTriangle(sideA, sideB, sideC));
    }

    @Test
    public void isRightAngledTriangleTrue2Test() throws Exception {
        double sideA = 3;
        double sideB = 5;
        double sideC = 4;
        String expResult = "This is right-angled triangle!";
        Assert.assertEquals(expResult, ifStatements.isRightAngledTriangle(sideA, sideB, sideC));
    }

    @Test
    public void isRightAngledTriangleTrue3Test() throws Exception {
        double sideA = 5;
        double sideB = 4;
        double sideC = 3;
        String expResult = "This is right-angled triangle!";
        Assert.assertEquals(expResult, ifStatements.isRightAngledTriangle(sideA, sideB, sideC));
    }

    @Test
    public void isRightAngledTriangleFalseTest() throws Exception {
        double sideA = 2;
        double sideB = 8;
        double sideC = 10;
        String expResult = "You have not right-angled triangle";
        Assert.assertEquals(expResult, ifStatements.isRightAngledTriangle(sideA, sideB, sideC));
    }


    @Test
    public void evenOrOddIsEvenTest() throws Exception {
        int number = 2;
        String expResult = "The number is even";
        Assert.assertEquals(expResult, ifStatements.evenOrOdd(number));
    }

    @Test
    public void evenOrOddIsOddTest() throws Exception {
        int number = 3;
        String expResult = "The number is odd";
        Assert.assertEquals(expResult, ifStatements.evenOrOdd(number));
    }

    @Test
    public void isBiggerEqualTest() throws Exception {
        double firstNumber = 2;
        double secondNumber = 2;
        String expResult = "Numbers are equal";
        Assert.assertEquals(expResult, ifStatements.isBigger(firstNumber, secondNumber));
    }

    @Test
    public void isBiggerTrueTest() throws Exception {
        double firstNumber = 3;
        double secondNumber = 2;
        String expResult = "The first number is bigger";
        Assert.assertEquals(expResult, ifStatements.isBigger(firstNumber, secondNumber));
    }

    @Test
    public void isBiggerFalseTest() throws Exception {
        double firstNumber = 2;
        double secondNumber = 3;
        String expResult = "The second number is bigger";
        Assert.assertEquals(expResult, ifStatements.isBigger(firstNumber, secondNumber));
    }
}