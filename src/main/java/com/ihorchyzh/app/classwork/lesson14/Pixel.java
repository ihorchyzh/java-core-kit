package com.ihorchyzh.app.classwork.lesson14;

/**
 * Created by ihorchyzh on 2/27/17.
 */
public class Pixel {
    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinates() {
        return new int[]{x, y};
    }
}