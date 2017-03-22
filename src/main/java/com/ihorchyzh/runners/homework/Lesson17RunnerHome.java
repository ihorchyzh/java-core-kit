package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson17.Pair;

/**
 * Created by ihorchyzh on 3/16/17.
 */
public class Lesson17RunnerHome {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(6,
                " Apr");
        System.out.println(pair.getFirst() + pair.getSecond());
    }

}