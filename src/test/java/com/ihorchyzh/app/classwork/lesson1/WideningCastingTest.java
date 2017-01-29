package com.ihorchyzh.app.classwork.lesson1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class WideningCastingTest {

    public static final double DELTA = 0;

    @Test
    public void widening() throws Exception {
        Assert.assertEquals(11.0f, WideningCasting.widening(11), DELTA);
    }

}