package com.ihorchyzh.app.homework.lesson1;

import com.ihorchyzh.app.classwork.lesson3.MathFunctions;
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
public class Lesson1VariablesParametrizedTest {

    @Before
    public void setUp() {
        lesson1Variables = new Lesson1Variables();
    }

    Lesson1Variables lesson1Variables;

    @Test
    @FileParameters(value = "src/test/resources/lesson1Data/trueData.csv", mapper = CsvWithHeaderMapper.class)
    public void variableString1Test(String str, boolean expRes) throws Exception {
        Assert.assertNotNull(lesson1Variables.str);
    }

}
