package com.ihorchyzh.app.classwork.lesson13;

/**
 * Created by ihorchyzh on 2/27/17.
 */
public class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public int doubleAge(int age) {
        age += age;
        return age;
    }

}
