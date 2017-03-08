package com.ihorchyzh.app.classwork.lesson15poly3;

/**
 * Created by ihorchyzh on 3/8/17.
 */
public class MethodOverloading {

    public void out() {
        System.out.println("This method out just text you are reading now :) ");
    }

    public void out(char ch) {
        System.out.println("This method out only one char " + ch);
    }

    public void out(char ch, int input) {
        System.out.println("This method out only one char and integer " + ch + " " + input);
    }

    public void out(int input, char ch) {
        System.out.println("This method out only one integer and char " + input + " " + ch);
    }

}
