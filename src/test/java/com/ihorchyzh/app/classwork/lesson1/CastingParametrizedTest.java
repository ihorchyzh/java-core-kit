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
public class CastingParametrizedTest {

    Casting casting;

    @Before
    public void setUp() {
        casting = new Casting();
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/narrowingData.csv", mapper = CsvWithHeaderMapper.class)
    public void narrowingCastingParametrizedTest(float floatNumber, int expectedResult) {
        Assert.assertEquals(expectedResult, casting.narrowing(floatNumber));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/wideningData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(int intNumber, float expected) {
        Assert.assertEquals(expected, casting.widening(intNumber), 0);
    }
}