package com.ihorchyzh.app.homework.lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by ihorchyzh on 1/31/17.
 */
public class Lesson1HomeTest {

    Lesson1Home lesson1Home;

    @Before
    public void setUp() {
        lesson1Home = new Lesson1Home();
    }

    @Test
    public void variableByteTest() throws Exception {
        byte b = 26;
        Assert.assertEquals(b, lesson1Home.b);
    }

    @Test
    public void variableShortTest() throws Exception {
        short s = 2033;
        Assert.assertNotEquals(s, lesson1Home.s);
    }

    @Test
    public void variableIntTest() throws Exception {
        int i = 8;
        Assert.assertEquals(i, lesson1Home.i);
    }

    @Test
    public void variableLongTest() throws Exception {
        long l = 63653563866868L;
        Assert.assertEquals(l, lesson1Home.l);
    }

    @Test
    public void variableFloatTest() throws Exception {
        float f = 2.7578f;
        float delta = 0.0001f;
        Assert.assertEquals(f, lesson1Home.f, delta);
    }

    @Test
    public void variableDoubleTest() throws Exception {
        double d = 5.76557D;
        double delta = 0.00001;
        Assert.assertEquals(d, lesson1Home.d, delta);
    }

    @Test
    public void variableChar1Test() throws Exception {
        char c = '|';
        Assert.assertEquals(c, lesson1Home.c);
    }

    @Test
    public void variableChar2Test() throws Exception {
        char c = '\u007C';
        Assert.assertEquals(c, lesson1Home.c);
    }

    @Test
    public void variableBoolean1Test() throws Exception {
        Assert.assertTrue(lesson1Home.bool);
    }

    @Test
    public void variableBoolean2Test() throws Exception {
        Assert.assertFalse(lesson1Home.boolNot);
    }

    @Test
    public void variableString1Test() throws Exception {
        Assert.assertNotNull(lesson1Home.str);
    }

    @Test
    public void variableString2Test() throws Exception {
        Assert.assertNull(lesson1Home.strNull);
    }

    @Test
    public void variableStringBothContainsStringTest() {
        String firstStr = "1";
        String secondStr = "q";
        Assert.assertThat(lesson1Home.str, both(containsString(firstStr)).and(containsString(secondStr)));
    }

}