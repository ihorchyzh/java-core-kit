package com.ihorchyzh.app.homework.lesson9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 2/19/17.
 */
public class PalindromeTest {

    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void palindromeCharAtMethod() throws Exception {
        String stringValue = "Dad";
        String expResult = "Palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeCharAtMethod(stringValue));
    }

    @Test
    public void palindromeCharAtMethodLowerCase() throws Exception {
        String stringValue = "dadd";
        String expResult = "Not palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeCharAtMethod(stringValue));
    }

    @Test
    public void palindromeToLowerCaseMethod() throws Exception {
        char[] charArray = {'p', 'a', 'R', 'A', 'R', 'p', 'a'};
        String expResult = "Palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeToLowerCaseMethod(charArray));
    }

    @Test
    public void notPalindromeToLowerCaseMethod() throws Exception {
        char[] charArray = {'p', 'a', 'A', 'R', 'p', 'a'};
        String expResult = "Not palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeToLowerCaseMethod(charArray));
    }

    @Test
    public void palindromeReverseMethod() throws Exception {
        String stringValue = "MOm";
        String expResult = "Palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeReverseMethod(stringValue));
    }

    @Test
    public void notPalindromeReverseMethod() throws Exception {
        String stringValue = "MOmmY";
        String expResult = "Not palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeReverseMethod(stringValue));
    }

    @Test
    public void palindromeEqualsIgnoreMethod() throws Exception {
        String stringValue = "MOom";
        String expResult = "Palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeEqualsIgnoreMethod(stringValue));
    }

    @Test
    public void notPalindromeEqualsIgnoreMethod() throws Exception {
        String stringValue = "MOomy";
        String expResult = "Not palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeEqualsIgnoreMethod(stringValue));
    }

    @Test
    public void palindromeReverseCharAtMethod() throws Exception {
        String stringValue = "Noon";
        String expResult = "Palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeReverseCharAtMethod(stringValue));
    }

    @Test
    public void notPalindromeReverseCharAtMethod() throws Exception {
        String stringValue = "No0n";
        String expResult = "Not palindrome";
        Assert.assertEquals(expResult, palindrome.palindromeReverseCharAtMethod(stringValue));
    }

}