package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson13.Teacher;

/**
 * Created by ihorchyzh on 2/27/17.
 */
public class Lesson13RunnerClass {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Bill", "Yale");

        System.out.println(teacher.getUniversity());
        System.out.println(teacher.isUniversityBlank());

    }

}
