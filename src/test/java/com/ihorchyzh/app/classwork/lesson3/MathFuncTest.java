package com.ihorchyzh.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 1/23/17.
 */
public class MathFuncTest {

    MathFunc mathFunc = new MathFunc();

    @Test // JUnit framework annotation

    public void multiplyTest(){

        int a = 4, b = 6, expRes = 24;

        Assert.assertEquals(expRes, mathFunc.multiply(a, b));

    }

    @Test // JUnit framework annotation

    public void sumTest(){

        int a = 4, b = 6, expRes = 10;

        Assert.assertEquals(expRes, mathFunc.sum(a, b));

    }

    @Test // JUnit framework annotation

    public void diffTest(){

        int a = 4, b = 6, expRes = -2;

        Assert.assertEquals(expRes, mathFunc.diff(a, b));

    }

    @Test // JUnit framework annotation

    public void divTest(){

        int a = 42, b = 6, expRes = 7;

        Assert.assertEquals(expRes, mathFunc.div(a, b));

    }

}