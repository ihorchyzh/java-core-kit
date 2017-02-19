package com.ihorchyzh.app.classwork.lesson5;

import com.ihorchyzh.app.classwork.lesson3.MathFunctions;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ihorchyzh on 1/30/17.
 */

@RunWith(JUnitParamsRunner.class)
public class BasicParametrizedTests {

    MathFunctions mathFunctions;

    @Before
    public void setUp() {
        mathFunctions = new MathFunctions();
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson5Data/testData.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected) {
        Assert.assertEquals(expected, mathFunctions.multiply(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson5Data/additionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(String a, String b, String expected) {
        Assert.assertEquals(expected, mathFunctions.addition(a, b));
    }

}