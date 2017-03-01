package com.ihorchyzh.app.classwork.lesson13;

/**
 * Created by ihorchyzh on 2/27/17.
 */
public class Student extends Person {  // class name

    private String university;   // class fields
    private String response = "Ehhh, what the question?";

    public Student(String name, String university) {  //  constructor
        super(name);  //  call parent (super) class constructor
        this.university = university;  // extends with new properties
    }

    public String getResponse(String question) {  //  method
        return response;
    }

}
