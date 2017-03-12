package com.ihorchyzh.app.homework.lesson16;

/**
 * Created by ihorchyzh on 3/12/17.
 */
public enum EnumPeople {
    PERSON1("Ihor Chyzh", 26), PERSON2("Tim Cook", 56),
    PERSON3("Donald Trump", 70), PERSON4("Barack Obama", 55);

    private int age;
    private String fullName;

    EnumPeople(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}