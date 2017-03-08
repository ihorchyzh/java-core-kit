package com.ihorchyzh.app.classwork.lesson15poly2;

import java.util.Objects;

/**
 * Created by ihorchyzh on 3/8/17.
 */
public class Teacher {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void lessonFinished() {
        System.out.println("Teacher says the lesson is over!");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Teacher)) {
            return false;
        }
        Teacher user = (Teacher) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

}

//Create class Mentor that extends class Teacher
//
//• Override lessonFinished() method for Mentor
//
//        • Override equals() method for Teacher class
//
//• Override hashCode() method for Teacher class