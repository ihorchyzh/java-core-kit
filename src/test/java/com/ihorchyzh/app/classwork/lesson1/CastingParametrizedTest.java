package com.ihorchyzh.app.classwork.lesson1;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Created by ihorchyzh on 2/1/17.
 */
@RunWith(JUnitParamsRunner.class)
public class CastingParametrizedTest {

    @Before
    public void setUp() {
        narrowingCasting = new NarrowingCasting();
        wideningCasting = new WideningCasting();
    }

    NarrowingCasting narrowingCasting;
    WideningCasting wideningCasting;

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/narrowingData.csv", mapper = CsvWithHeaderMapper.class)
    public void narrowingCastingParametrizedTest(float floatNumber,int expectedResult) {
        Assert.assertEquals(expectedResult, narrowingCasting.narrowing(floatNumber));
    }

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/wideningData.csv", mapper = CsvWithHeaderMapper.class)
    public void additionTest(int intNumber, float expected) {
        Assert.assertEquals(expected, wideningCasting.widening(intNumber), 0);
    }
}
