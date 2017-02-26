package com.ihorchyzh.app.homework.lesson12;

/**
 * Created by ihorchyzh on 2/26/17.
 */
public class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
            System.out.println("New age setted");
        } else {
            System.out.println("Age invalid");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

}