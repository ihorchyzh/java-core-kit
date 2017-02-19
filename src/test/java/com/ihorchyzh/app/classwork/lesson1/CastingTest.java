package com.ihorchyzh.app.classwork.lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class CastingTest {

    public static final double DELTA = 0;
    Casting casting;

    @Before
    public void setUp() {
        casting = new Casting();
    }

    @Test
    public void floatToCharTest() {

        Assert.assertEquals('|', casting.floatToChar(124.0f));

    }

    @Test
    public void intToCharTest() {

        Assert.assertEquals('|', casting.intToChar(124));

    }

    @Test
    public void charToIntTest() {

        Assert.assertEquals(124, casting.charToInt('|'));

    }

    @Test
    public void widening() throws Exception {
        Assert.assertEquals(11.0f, casting.widening(11), DELTA);
    }

    @Test
    public void narrowing() throws Exception {
        Assert.assertEquals(12, casting.narrowing(12.7f));
    }

}