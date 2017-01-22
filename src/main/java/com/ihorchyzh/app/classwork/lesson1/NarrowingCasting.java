package com.ihorchyzh.app.classwork.lesson1;

/**
 * Created by ihorchyzh on 1/19/17.
 */
public class NarrowingCasting {

    public static void main(String[] args) {

        NarrowingCasting narrowingCasting = new NarrowingCasting();
        narrowingCasting.narrowing();

    }

    int int1 = 127;
    float float1 = 31.5f;

//        public void narrowing() {
//
//            float1 = int1;
//            System.out.println(float1);
//
//        }

        public void narrowing() {

            int1 = (int) float1;
            System.out.println(int1);

        }


}