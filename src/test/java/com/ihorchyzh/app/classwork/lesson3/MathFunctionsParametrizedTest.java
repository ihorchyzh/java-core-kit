package com.ihorchyzh.app.classwork.lesson3;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ihorchyzh on 2/1/17.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFunctionsParametrizedTest {

    public static final double DELTA = 0.01;

    @Before
    public void setUp() {
        mathFunctions = new MathFunctions();
    }

    MathFunctions mathFunctions;

    @Test
    @FileParameters(value = "src/test/resources/lesson3Data/multiplyTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expRes) {
        Assert.assertEquals(expRes, mathFunctions.multiply(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson3Data/additionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(String a, String b, String expRes) {
        Assert.assertEquals(expRes, mathFunctions.addition(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson3Data/subtractionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void subtractionTest(int a, int b, int expRes) {
        Assert.assertEquals(expRes, mathFunctions.subtraction(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson3Data/chooseMaxNumberTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void chooseMaxNumberTest(double a, double b, double expRes) {
        Assert.assertEquals(expRes, mathFunctions.chooseMaxNumber(a, b), DELTA);
    }

    @Test
    public void getSquareRoot() {
        double a = 25.0d, expRes = 5.0d;
        Assert.assertEquals(expRes, mathFunctions.getSquareRoot(a), DELTA);
    }

    @Test
    public void powerTest() {
        double a = 2.0d, b = 3.0d, expRes = 9.0d;
        Assert.assertNotEquals(expRes, mathFunctions.power(a, b), DELTA);
    }

    @Test
    public void isOddNumberTrueTest() {
        int number = 3;
        Assert.assertTrue(mathFunctions.isOddNumber(number));
    }

    @Test
    public void isOddNumberFalseTest() {
        int number = 4;
        Assert.assertFalse(mathFunctions.isOddNumber(number));
    }




}
