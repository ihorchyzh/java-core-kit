package com.ihorchyzh.app.classwork.lesson0;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ihorchyzh on 1/24/17.
 */
public class Lesson0ClassTest {

    Lesson0Class lesson0Class = new Lesson0Class();

    @Test
    public void floatToCharTest() {

        Assert.assertEquals('|', lesson0Class.floatToChar(124.0f));

    }

    @Test
    public void intToCharTest() {

        Assert.assertEquals('|', lesson0Class.intToChar(124));

    }

    @Test
    public void charToIntTest() {

        Assert.assertEquals(124, lesson0Class.charToInt('|'));

    }

}