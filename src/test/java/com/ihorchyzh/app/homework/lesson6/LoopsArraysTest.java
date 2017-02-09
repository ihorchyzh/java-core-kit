package com.ihorchyzh.app.homework.lesson6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 2/8/17.
 */
public class LoopsArraysTest {
    @Before
    public void setUp() throws Exception {
        loopsArrays = new LoopsArrays();
    }

    LoopsArrays loopsArrays;

    @Test
    public void evenArrayLengthCount() throws Exception {
        int startNumber = 0;
        int endNumber = 8;
        int expResult = 5;
        Assert.assertEquals(expResult, loopsArrays.evenArrayLengthCount(startNumber, endNumber));
    }

    @Test
    public void oddArrayLengthCount() throws Exception {
        int startNumber = 0;
        int endNumber = 8;
        int expResult = 4;
        Assert.assertEquals(expResult, loopsArrays.oddArrayLengthCount(startNumber, endNumber));
    }

    @Test
    public void evenArrayElementOut() throws Exception {
        int arrayLength = 4;
        int[] expResult = {2, 4, 6, 8};
        Assert.assertArrayEquals(expResult, loopsArrays.evenArrayElementOut(arrayLength));
    }

    @Test
    public void formattedHorizontalArray() throws Exception {
        int[] array = {2, 4, 6, 8};
        String expResult = "2 4 6 8";
        Assert.assertEquals(expResult, loopsArrays.formattedHorizontalArray(array));
    }

    @Test
    public void formattedVerticalArray() throws Exception {
        int[] array = {2, 4, 6, 8};
        String expResult = "2\n" + "4\n" + "6\n" + "8";
        Assert.assertEquals(expResult, loopsArrays.formattedVerticalArray(array));
    }

    @Test
    public void oddArrayElementOut() throws Exception {

    }

    @Test
    public void reverseArray() throws Exception {

    }

    @Test
    public void randomGeneratedArray2C() throws Exception {

    }

    @Test
    public void countOfEvenNumbersInArray() throws Exception {

    }

    @Test
    public void randomGeneratedArray2D() throws Exception {

    }

    @Test
    public void maxNumberInArray() throws Exception {

    }

    @Test
    public void minNumberInArray() throws Exception {

    }

    @Test
    public void multiDimensionalArray() throws Exception {

    }

    @Test
    public void formattedVerticalMultiDimensionalArray() throws Exception {

    }

}