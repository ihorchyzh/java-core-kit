package com.ihorchyzh.app.classwork.lesson10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ihorchyzh on 3/8/17.
 */
public class StringBuilderOperationsTest {

    StringBuilderOperations stringBuilderOperations;

    @Before
    public void setUp() throws Exception {
        stringBuilderOperations = new StringBuilderOperations();
    }

    @Test
    public void countWordsForLoop() throws Exception {
        String input = "There are 4 words.";
        String expRes = "You entered: [There, are, 4, words.]\n" +
                "There are: 4 elements.";
        Assert.assertEquals(expRes, stringBuilderOperations.countWordsForLoop(input));
    }

    @Test
    public void countWordsStringLength() throws Exception {
        String input = "There are 4 words.";
        String expRes = "Count of words: 4\n" +
                "Sentence is: There are 4 words.";
        Assert.assertEquals(expRes, stringBuilderOperations.countWordsStringLength(input));
    }

    @Test
    public void countWordsChatAt() throws Exception {
        String input = "chars";
        int expRes = 5;
        Assert.assertEquals(expRes, stringBuilderOperations.countWordsChatAt(input));
    }

}