package com.ihorchyzh.app.classwork.lesson9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Igor Chyzh on 2/15/2017.
 */
public class ArrayOperationsHomeTest {

    ArrayOperations arrayOperations;

    @Before
    public void setUp() throws Exception {
        arrayOperations = new ArrayOperations();
    }

    @Test
    public void concatenation() throws Exception {
        String firstName = "Mike ";
        String secondName = "\u0066";
        String expResult = "Mike \u0066";
        Assert.assertEquals(expResult, arrayOperations.concatenation(firstName, secondName));
    }

    @Test
    public void outArrayOfChars() throws Exception {
        char[] arrayOfChars = {'6', 64, 'g', '\u0066'};
        String expResult = "[6, @, g, f]";
        Assert.assertEquals(expResult, arrayOperations.outArrayOfChars(arrayOfChars));
    }

    @Test
    public void outArrayOfChars2() throws Exception {
        char[] arrayOfChars = {'6', 64, 'g', '\u0066'};
        String expResult = "6@gf";
        Assert.assertEquals(expResult, arrayOperations.outArrayOfChars2(arrayOfChars));
    }

    @Test
    public void byteToString() throws Exception {
        byte byteValue = 20;
        String expResult = "20";
        Assert.assertEquals(expResult, arrayOperations.byteToString(byteValue));
    }

    @Test
    public void stringToByte() throws Exception {
        String stringValue = "20";
        byte expResult = 20;
        Assert.assertEquals(expResult, arrayOperations.stringToByte(stringValue));
    }

    @Test
    public void shortToString() throws Exception {
        short shortValue = 50;
        String expResult = "50";
        Assert.assertEquals(expResult, arrayOperations.shortToString(shortValue));
    }

    @Test
    public void stringToShort() throws Exception {
        String stringValue = "50";
        short expResult = 50;
        Assert.assertEquals(expResult, arrayOperations.stringToShort(stringValue));
    }

    @Test
    public void intToString() throws Exception {
        int intValue = 70;
        String expResult = "70";
        Assert.assertEquals(expResult, arrayOperations.intToString(intValue));
    }

    @Test
    public void stringToInt() throws Exception {
        String stringValue = "70";
        int expResult = 70;
        Assert.assertEquals(expResult, arrayOperations.stringToInt(stringValue));
    }

    @Test
    public void longToString() throws Exception {
        long longValue = 46446464646464L;
        String expResult = "46446464646464";
        Assert.assertEquals(expResult, arrayOperations.longToString(longValue));
    }

    @Test
    public void stringToLong() throws Exception {
        String stringValue = "46446464646464";
        long expResult = 46446464646464L;
        Assert.assertEquals(expResult, arrayOperations.stringToLong(stringValue));
    }

    @Test
    public void floatToString() throws Exception {
        float floatValue = 155f;
        String expResult = "155.0";
        Assert.assertEquals(expResult, arrayOperations.floatToString(floatValue));
    }

    @Test
    public void stringToFloat() throws Exception {
        String stringValue = "155.0";
        float expResult = 155f;
        float delta = 1f;
        Assert.assertEquals(expResult, arrayOperations.stringToFloat(stringValue), delta);
    }

    @Test
    public void doubleToString() throws Exception {
        double doubleValue = 200d;
        String expResult = "200.0";
        Assert.assertEquals(expResult, arrayOperations.doubleToString(doubleValue));
    }

    @Test
    public void stringToDouble() throws Exception {
        String stringValue = "200";
        double expResult = 200d;
        double delta = 1d;
        Assert.assertEquals(expResult, arrayOperations.stringToDouble(stringValue), delta);
    }

    @Test
    public void booleanToString() throws Exception {
        boolean booleanValue = true;
        String expResult = "true";
        Assert.assertEquals(expResult, arrayOperations.booleanToString(booleanValue));
    }

    @Test
    public void stringToBoolean() throws Exception {
        String stringValue = "false";
        Assert.assertFalse(arrayOperations.stringToBoolean(stringValue));
    }

}