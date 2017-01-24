package com.ihorchyzh.app.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 1/24/17.
 */
public class PrimitiveConverterTest {

    PrimitiveConverter primitiveConverter = new PrimitiveConverter();

    @Test
    public void floatToCharAssertSameTest() {

        Assert.assertSame("Should be the same", '|', primitiveConverter.floatToChar(124.0f));

    }

    @Test
    public void intToCharAssertSameTest() {

        Assert.assertSame("Should be the same", '|', primitiveConverter.intToChar(124));

    }

    @Test
    public void charToIntAssertSameTest() {

        Assert.assertSame("Should be the same", 124, primitiveConverter.charToInt('|'));

    }

    @Test
    public void floatToCharAssertNotSameTest() {

        Assert.assertNotSame("Shouldn't be the same", '=', primitiveConverter.floatToChar(124.0f));

    }

    @Test
    public void intToCharAssertNotSameTest() {

        Assert.assertNotSame("Shouldn't be the same", '-', primitiveConverter.intToChar(124));

    }

    @Test
    public void charToIntAssertNotSameTest() {

        Assert.assertNotSame("Shouldn't be the same", 125, primitiveConverter.charToInt('|'));

    }

    @Test
    public void floatToCharAssertNotNullTest() {

        Assert.assertNotNull("Shouldn't be NULL", primitiveConverter.floatToChar(124.0f));

    }

    @Test
    public void intToCharAssertNotNullTest() {

        Assert.assertNotNull("Shouldn't be NULL", primitiveConverter.intToChar(124));

    }

    @Test
    public void charToIntAssertNotNullTest() {

        Assert.assertNotNull("Shouldn't be NULL", primitiveConverter.charToInt('|'));

    }

}