package com.ihorchyzh.app.homework.lesson6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 2/8/17.
 */
public class Lesson6HomeTest {
    Lesson6Home lesson6Home;

    @Before
    public void setUp() throws Exception {
        lesson6Home = new Lesson6Home();
    }

    @Test
    public void evenArrayLengthCount() throws Exception {
        int startNumber = 0;
        int endNumber = 8;
        int expResult = 5;
        Assert.assertEquals(expResult, lesson6Home.evenArrayLengthCount(startNumber, endNumber));
    }

    @Test
    public void oddArrayLengthCount() throws Exception {
        int startNumber = 0;
        int endNumber = 8;
        int expResult = 4;
        Assert.assertEquals(expResult, lesson6Home.oddArrayLengthCount(startNumber, endNumber));
    }

    @Test
    public void evenArrayElementOut() throws Exception {
        int arrayLength = 4;
        int[] expResult = {2, 4, 6, 8};
        Assert.assertArrayEquals(expResult, lesson6Home.evenArrayElementOut(arrayLength));
    }

    @Test
    public void formattedHorizontalArray() throws Exception {
        int[] array = {2, 4, 6, 8};
        String expResult = "2 4 6 8";
        Assert.assertEquals(expResult, lesson6Home.formattedHorizontalArray(array));
    }

    @Test
    public void formattedVerticalArray() throws Exception {
        int[] array = {2, 4, 6, 8};
        String expResult = "2\n" + "4\n" + "6\n" + "8";
        Assert.assertEquals(expResult, lesson6Home.formattedVerticalArray(array));
    }

    @Test
    public void oddArrayElementOut() throws Exception {
        int arrayLength = 8;
        int[] expArrayOut = {1, 3, 5, 7, 9, 11, 13, 15};
        Assert.assertArrayEquals(expArrayOut, lesson6Home.oddArrayElementOut(arrayLength));
    }

    @Test
    public void reverseArray() throws Exception {
        int[] array = {4, 5, 3, 1};
        int[] expArrayOut = {1, 3, 5, 4};
        Assert.assertArrayEquals(expArrayOut, lesson6Home.reverseArray(array));
    }

    @Test
    public void randomGeneratedArray2C() throws Exception {
        int arrayLength = 5;
        int arrayStart = 2;
        int arrayEnd = 10;
        int expArrayLength = 5;
        Assert.assertEquals(expArrayLength, lesson6Home.randomGeneratedArray2C(arrayLength, arrayStart, arrayEnd).length);
    }

    @Test
    public void countOfEvenNumbersInArray() throws Exception {
        int[] array = {3, 3, 3, 4, 6};
        int expResult = 2;
        Assert.assertEquals(expResult, lesson6Home.countOfEvenNumbersInArray(array));
    }

    @Test
    public void randomGeneratedArray2D() throws Exception {
        int arrayLength = 5;
        int arrayStart = 2;
        int arrayEnd = 10;
        int expArrayLength = 5;
        Assert.assertEquals(expArrayLength, lesson6Home.randomGeneratedArray2D(arrayLength, arrayStart, arrayEnd).length);
    }

    @Test
    public void maxNumberInArray() throws Exception {
        int[] array = {1, 55, -10};
        int expResult = 55;
        Assert.assertEquals(expResult, lesson6Home.maxNumberInArray(array));
    }

    @Test
    public void minNumberInArray() throws Exception {
        int[] array = {1, 55, -10};
        int expResult = -10;
        Assert.assertEquals(expResult, lesson6Home.minNumberInArray(array));
    }

    @Test
    public void multiDimensionalArray() throws Exception {
        int columns = 2;
        int rows = 2;
        int startOfSegment = 10;
        int endOfSegment = 12;
        int[][] expResult = {{0, 0}, {0, 0}};
        Assert.assertNotEquals(expResult, lesson6Home.multiDimensionalArray(columns, rows, startOfSegment, endOfSegment));
    }

    @Test
    public void formattedVerticalMultiDimensionalArray() throws Exception {
        int[][] array = {{4, 5}, {5, 4}};
        String expResult = "4, 5\n5, 4";
        Assert.assertEquals(expResult, lesson6Home.formattedVerticalMultiDimensionalArray(array));
    }

}