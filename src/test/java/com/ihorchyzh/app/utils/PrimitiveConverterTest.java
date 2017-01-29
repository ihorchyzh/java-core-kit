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
    public void floatToCharTest() {

        Assert.assertEquals('|', primitiveConverter.floatToChar(124.0f));

    }

    @Test
    public void intToCharTest() {

        Assert.assertEquals('|', primitiveConverter.intToChar(124));

    }

    @Test
    public void charToIntTest() {

        Assert.assertEquals(124, primitiveConverter.charToInt('|'));

    }

}