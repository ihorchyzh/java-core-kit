package com.ihorchyzh.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by ihorchyzh on 2/9/17.
 */
@RunWith(JUnitParamsRunner.class)
public class LoopsArraysParametrizedTest {

    @Before
    public void setUp() {
        loopsArrays = new LoopsArrays();
    }

    LoopsArrays loopsArrays;

    @Test
    @FileParameters(value = "src/test/resources/lesson5Data/testData.csv", mapper = CsvWithHeaderMapper.class)
    public void oddArrayElementOut(int arrayLength, int[] expResult) throws Exception {
        Assert.assertArrayEquals(expResult, loopsArrays.oddArrayElementOut(arrayLength));
    }
}