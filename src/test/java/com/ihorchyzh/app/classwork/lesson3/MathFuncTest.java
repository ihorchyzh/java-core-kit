package com.ihorchyzh.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ihorchyzh on 1/23/17.
 */
public class MathFuncTest {

    @Test // JUnit framework annotation

    public void multiplyTest(){

        MathFunc mathFunc = new MathFunc();

        int a = 4, b = 6, expRes = 24;

        Assert.assertEquals(expRes, mathFunc.multiply(a, b));

    }

}