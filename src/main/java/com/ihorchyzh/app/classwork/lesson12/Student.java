package com.ihorchyzh.app.classwork.lesson12;

/**
 * Created by ihorchyzh on 2/23/17.
 */
public class Student {

    private String firstName;
    private String lastName;

    public String getName() {
        return firstName + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String studentGeneral(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        String string = "!";
        String comma = ", ";
        return this.firstName + comma + this.lastName + string;
    }

}
