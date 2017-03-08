package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15poly2.Mentor;
import com.ihorchyzh.app.classwork.lesson15poly2.Teacher;

/**
 * Created by ihorchyzh on 3/8/17.
 */
public class Lesson15Poly2RunnerClass {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        Teacher mentor = new Mentor();

        teacher.lessonFinished();
        mentor.lessonFinished();

//        teacher.setAge(44);
//        teacher1.setAge(44);

        teacher.setAge(44);
        teacher1.setAge(22);

        System.out.println(teacher.equals(teacher1));

        if (teacher.hashCode() == teacher1.hashCode()) {
            System.out.println("Hash code is the same");
        } else {
            System.out.println("Hash code is different");
            System.out.println(teacher.hashCode() + " vs " + teacher1.hashCode());
        }

    }

}