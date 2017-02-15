package com.ihorchyzh.app.classwork.lesson7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by ihorchyzh on 2/9/17.
 */
public class Lesson7ClassTest {

    Lesson7Class lesson7Class;

    @Before
    public void setUp() {
        lesson7Class = new Lesson7Class();
    }

    @Test
    public void baubleSortSmallToBig1() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7Class.baubleSortSmallToBig1(array));
    }

    @Test
    public void baubleSortBigToSmall1() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {4, 3, 2, 1};
        Assert.assertArrayEquals(expResult, lesson7Class.baubleSortBigToSmall1(array));
    }

    @Test
    public void baubleSortSmallToBig2() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7Class.baubleSortSmallToBig2(array));
    }

    @Test
    public void baubleSortBigToSmall2() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {4, 3, 2, 1};
        Assert.assertArrayEquals(expResult, lesson7Class.baubleSortBigToSmall2(array));
    }

    @Test
    public void sortArray() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7Class.sortArray(array));
    }

    @Test
    public void charArray() throws Exception {
        int size = 256;
        String expArrayItem = "<, =, >";
        Assert.assertThat(Arrays.toString(lesson7Class.charArray(size)), containsString(expArrayItem));
    }

}