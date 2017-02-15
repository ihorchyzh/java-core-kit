package com.ihorchyzh.app.classwork.lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 1/29/17.
 */
public class Lesson1ClassTest {

    public static final double DELTA = 0;
    Lesson1Class lesson1Class;

    @Before
    public void setUp() {
        lesson1Class = new Lesson1Class();
    }

    @Test
    public void widening() throws Exception {
        Assert.assertEquals(11.0f, lesson1Class.widening(11), DELTA);
    }

    @Test
    public void narrowing() throws Exception {
        Assert.assertEquals(12, lesson1Class.narrowing(12.7f));
    }

}