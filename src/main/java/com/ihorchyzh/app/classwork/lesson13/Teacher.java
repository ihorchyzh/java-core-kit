package com.ihorchyzh.app.classwork.lesson13;

/**
 * Created by ihorchyzh on 2/27/17.
 */
public class Teacher extends Person {

    private String university;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Teacher(String name, String university) {
        super(name);
        this.university = university;
    }

    public final boolean isUniversityBlank() {
        boolean result;
        if (this.university.isEmpty()) {
            System.out.println("Enter university name");
            result = false;
        } else {
            result = true;
        }
        return result;
    }

    public int doubleAge(int age) {
        age += 3;
        return age;
    }

}
