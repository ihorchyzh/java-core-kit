package com.ihorchyzh.app.classwork.lesson7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void baubleSortSmallToBig() throws Exception {
        int[] array = {3, 1, 4, 2};
        int[] expResult = {1, 2, 3, 4};
        Assert.assertArrayEquals(expResult, lesson7.baubleSortSmallToBig(array));
    }

}