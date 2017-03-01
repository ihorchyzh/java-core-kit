package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson14.Line;
import com.ihorchyzh.app.classwork.lesson14.Pixel;

import java.util.Arrays;

/**
 * Created by ihorchyzh on 2/27/17.
 */
public class Lesson14RunnerClass {

    public static void main(String[] args) {
        Pixel pixel1 = new Pixel(10, 14);
        Pixel pixel2 = new Pixel(14, 18);
        Pixel pixel3 = new Pixel(18, 20);
        Line line = new Line(10, 20);
        line.addPixel(pixel1);
        line.addPixel(pixel2);
        line.addPixel(pixel3);
        System.out.println(Arrays.toString(line.getCoordinates()));
    }

}