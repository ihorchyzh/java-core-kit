package com.ihorchyzh.app.classwork.lesson1;

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
public class Lesson1ClassParametrizedTest {

    Lesson1Class lesson1Class;

    @Before
    public void setUp() {
        lesson1Class = new Lesson1Class();
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/narrowingData.csv", mapper = CsvWithHeaderMapper.class)
    public void narrowingCastingParametrizedTest(float floatNumber, int expectedResult) {
        Assert.assertEquals(expectedResult, lesson1Class.narrowing(floatNumber));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/wideningData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(int intNumber, float expected) {
        Assert.assertEquals(expected, lesson1Class.widening(intNumber), 0);
    }
}