package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson16.GameNames;

import java.util.Scanner;

/**
 * Created by ihorchyzh on 3/12/17.
 */
public class Lesson16RunnerHome {

    public static void main(String[] args) {

        GameNames gameNames = new GameNames();
        Scanner scanner = new Scanner(System.in);
        gameNames.showPersons();
        int rnd = gameNames.showRandom();
        int userInput = scanner.nextInt();
        gameNames.verifyPerson(userInput, rnd);

    }

}