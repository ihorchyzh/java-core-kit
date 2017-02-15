package com.ihorchyzh.app.classwork.lesson5;

import com.ihorchyzh.app.classwork.lesson3.Lesson3Class;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by ihorchyzh on 1/30/17.
 */

@RunWith(JUnitParamsRunner.class)
public class BasicParametrizedTests {

    @Before
    public void setUp() {
        lesson3Class = new Lesson3Class();
    }

    Lesson3Class lesson3Class;

    @Test
    @FileParameters(value = "src/test/resources/lesson5Data/testData.csv", mapper = CsvWithHeaderMapper.class)
    public void multiplyTest(int a, int b, int expected) {
        Assert.assertEquals(expected, lesson3Class.multiply(a, b));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson5Data/additionTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(String a, String b, String expected) {
        Assert.assertEquals(expected, lesson3Class.addition(a, b));
    }

}