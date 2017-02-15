package com.ihorchyzh.app.classwork.lesson7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.CoreMatchers.containsString;
/**
 * Created by ihorchyzh on 2/9/17.
 */
public class Lesson7Test {

    @Before
    public void setUp() {
        lesson7 = new Lesson7();
    }

    Lesson7 lesson7;

    @Test
    public void baubleSortSmallToBig1() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7.baubleSortSmallToBig1(array));
    }

    @Test
    public void baubleSortBigToSmall1() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {4, 3, 2, 1};
        Assert.assertArrayEquals(expResult, lesson7.baubleSortBigToSmall1(array));
    }

    @Test
    public void baubleSortSmallToBig2() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7.baubleSortSmallToBig2(array));
    }

    @Test
    public void baubleSortBigToSmall2() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {4, 3, 2, 1};
        Assert.assertArrayEquals(expResult, lesson7.baubleSortBigToSmall2(array));
    }

    @Test
    public void sortArray() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7.sortArray(array));
    }

    @Test
    public void charArray() throws Exception {
        int size = 256;
        String expArrayItem = "<, =, >";
        Assert.assertThat(Arrays.toString(lesson7.charArray(size)), containsString(expArrayItem));
    }

}