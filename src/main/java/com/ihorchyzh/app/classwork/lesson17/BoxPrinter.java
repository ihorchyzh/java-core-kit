package com.ihorchyzh.app.classwork.lesson17;

/**
 * Created by ihorchyzh on 3/13/17.
 */
public class BoxPrinter {
    private Object val;

    public BoxPrinter(Object arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public Object getValue() {
        return val;
    }
}