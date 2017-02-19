package com.ihorchyzh.app.homework.lesson8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 2/19/17.
 */
public class MultidimensionalArraysTest {

    MultidimensionalArrays multidimensionalArrays;

    @Before
    public void setUp() throws Exception {
        multidimensionalArrays = new MultidimensionalArrays();
    }

    @Test
    public void multidimensionalArray() throws Exception {
        int rows = 2;
        int columns = 3;
        int startElement = 8;
        int endElement = 8;
        int[][] expResult = {{8, 8, 8}, {8, 8, 8}};
        Assert.assertArrayEquals(expResult, multidimensionalArrays
                .multidimensionalArray(rows, columns, startElement, endElement));
    }

    @Test
    public void minMultidimensionalArrayValue() throws Exception {
        int[][] array = {{5, 6, 3}, {8, 9, 10}};
        int expResult = 3;
        Assert.assertEquals(expResult, multidimensionalArrays.minMultidimensionalArrayValue(array));
    }

    @Test
    public void maxMultidimensionalArrayValue() throws Exception {
        int[][] array = {{5, 6, 3}, {8, 9, 10}};
        int expResult = 10;
        Assert.assertEquals(expResult, multidimensionalArrays.maxMultidimensionalArrayValue(array));
    }

}