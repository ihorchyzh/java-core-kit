package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson11.InputOutputOperations;

/**
 * Created by Ihor Chyzh on 2/21/2017.
 */
public class Lesson11RunnerHome {

    public static void main(String[] args) {

        InputOutputOperations io = new InputOutputOperations();
        io.writeFile(io.sortArray(io.stringToIntArray(io.readFile())));
        io.isPalindromeInFile();

    }

}
