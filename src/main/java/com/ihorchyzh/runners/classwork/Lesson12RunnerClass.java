package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson12.Student;

/**
 * Created by ihorchyzh on 2/23/17.
 */
public class Lesson12RunnerClass {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        student.setName("Ihor", "Chyzh");
        System.out.println(student.getName());
        System.out.println(student.studentGeneral("Ihor", "Chyzh"));

    }



}
