package com.ihorchyzh.runners.classwork;

/**
 * Created by ihorchyzh on 3/12/17.
 */
public class Lesson10PerformanceRunnerClass {

    public static void main(String[] args) {

//        MEASURE STRING PERFORMANCE
        long start = System.currentTimeMillis();
        String c = "start";
        String b = "finish";
        for (long i = 0; i < 10000L; i++) {
            c = c.concat(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


//        MEASURE STRING BUILDER PERFORMANCE
        long start1 = System.currentTimeMillis();
        StringBuilder c1 = new StringBuilder("start");
        String b1 = "finish";
        for (long i = 0; i < 10000L; i++) {
            c1 = c1.append(b);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

    }
}