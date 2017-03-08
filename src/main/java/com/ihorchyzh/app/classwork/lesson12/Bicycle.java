package com.ihorchyzh.app.classwork.lesson12;

/**
 * Created by ihorchyzh on 2/23/17.
 */
public class Bicycle { //class name

    private int wheelSize;
    private String color; //variable
    private String type;
    private int speed;

    public Bicycle() { // no-args constructor
        this.wheelSize = 26;
        this.color = "red";
        this.type = "mountain";
    }

    public Bicycle(int wheelSize, int speed) { // constructor with args
        this(); // call no-args constructor
        this.wheelSize = wheelSize;
    }

    public Bicycle(int wheelSize, String color) { // constructor with args
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public Bicycle(String type, int wheelSize, String color) {
        this(wheelSize, color);
        this.type = "mountain";
    }

    public Bicycle(int speed) {
        this.speed = speed;
    }


}