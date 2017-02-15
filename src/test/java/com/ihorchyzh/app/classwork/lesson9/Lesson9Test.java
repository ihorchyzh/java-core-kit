package com.ihorchyzh.app.classwork.lesson9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Igor Chyzh on 2/15/2017.
 */
public class Lesson9Test {
    @Before
    public void setUp() throws Exception {
        lesson9 = new Lesson9();
    }

    Lesson9 lesson9;

    @Test
    public void concatenation() throws Exception {
        String firstName = "Mike ";
        String secondName = "\u0066";
        String expResult = "Mike \u0066";
        Assert.assertEquals(expResult, lesson9.concatenation(firstName, secondName));
    }

    @Test
    public void outArrayOfChars() throws Exception {
        char[] arrayOfChars = {'6', 64, 'g', '\u0066'};
        String expResult = "[6, @, g, f]";
        Assert.assertEquals(expResult, lesson9.outArrayOfChars(arrayOfChars));
    }

    @Test
    public void outArrayOfChars2() throws Exception {
        char[] arrayOfChars = {'6', 64, 'g', '\u0066'};
        String expResult = "6@gf";
        Assert.assertEquals(expResult, lesson9.outArrayOfChars2(arrayOfChars));
    }

    @Test
    public void byteToString() throws Exception {
        byte byteValue = 20;
        String expResult = "20";
        Assert.assertEquals(expResult, lesson9.byteToString(byteValue));
    }

    @Test
    public void stringToByte() throws Exception {
        String stringValue = "20";
        byte expResult = 20;
        Assert.assertEquals(expResult, lesson9.stringToByte(stringValue));
    }

    @Test
    public void shortToString() throws Exception {
        short shortValue = 50;
        String expResult = "50";
        Assert.assertEquals(expResult, lesson9.shortToString(shortValue));
    }

    @Test
    public void stringToShort() throws Exception {
        String stringValue = "50";
        short expResult = 50;
        Assert.assertEquals(expResult, lesson9.stringToShort(stringValue));
    }

    @Test
    public void intToString() throws Exception {
        int intValue = 70;
        String expResult = "70";
        Assert.assertEquals(expResult, lesson9.intToString(intValue));
    }

    @Test
    public void stringToInt() throws Exception {
        String stringValue = "70";
        int expResult = 70;
        Assert.assertEquals(expResult, lesson9.stringToInt(stringValue));
    }

    @Test
    public void longToString() throws Exception {
        long longValue = 46446464646464L;
        String expResult = "46446464646464";
        Assert.assertEquals(expResult, lesson9.longToString(longValue));
    }

    @Test
    public void stringToLong() throws Exception {
        String stringValue = "46446464646464";
        long expResult = 46446464646464L;
        Assert.assertEquals(expResult, lesson9.stringToLong(stringValue));
    }

    @Test
    public void floatToString() throws Exception {
        float floatValue = 155f;
        String expResult = "155.0";
        Assert.assertEquals(expResult, lesson9.floatToString(floatValue));
    }

    @Test
    public void stringToFloat() throws Exception {
        String stringValue = "155.0";
        float expResult = 155f;
        float delta = 1f;
        Assert.assertEquals(expResult, lesson9.stringToFloat(stringValue), delta);
    }

    @Test
    public void doubleToString() throws Exception {
        double doubleValue = 200d;
        String expResult = "200.0";
        Assert.assertEquals(expResult, lesson9.doubleToString(doubleValue));
    }

    @Test
    public void stringToDouble() throws Exception {
        String stringValue = "200";
        double expResult = 200d;
        double delta = 1d;
        Assert.assertEquals(expResult, lesson9.stringToDouble(stringValue), delta);
    }

    @Test
    public void booleanToString() throws Exception {
        boolean booleanValue = true;
        String expResult = "true";
        Assert.assertEquals(expResult, lesson9.booleanToString(booleanValue));
    }

    @Test
    public void stringToBoolean() throws Exception {
        String stringValue = "false";
        Assert.assertFalse(lesson9.stringToBoolean(stringValue));
    }

}