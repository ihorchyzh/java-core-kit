package com.ihorchyzh.app.classwork.lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class NarrowingCastingTest {

    @Before
    public void setUp() {
        narrowingCasting = new NarrowingCasting();
    }

    NarrowingCasting narrowingCasting;

    @Test
    public void narrowing() throws Exception {
        Assert.assertEquals(12, narrowingCasting.narrowing(12.7f));
    }

}