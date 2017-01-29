package com.ihorchyzh.app.classwork.lesson1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class NarrowingCastingTest {
    @Test
    public void narrowing() throws Exception {
        Assert.assertEquals(12, NarrowingCasting.narrowing(12.7f));
    }

}