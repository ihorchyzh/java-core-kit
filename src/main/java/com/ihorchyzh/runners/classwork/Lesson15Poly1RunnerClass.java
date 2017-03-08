package com.ihorchyzh.runners.classwork;

import com.ihorchyzh.app.classwork.lesson15poly1.Wood;
import com.ihorchyzh.app.classwork.lesson15poly1.WoodenStick;
import com.ihorchyzh.app.classwork.lesson15poly1.WoodenTree;

/**
 * Created by ihorchyzh on 3/6/17.
 */
public class Lesson15Poly1RunnerClass {

    public static void main(String[] args) {

        Wood woodenStick = new WoodenStick();
        Wood woodenTree = new WoodenTree();
        Wood wood = new Wood();

        wood.setQuantity(4);
        woodenStick.setQuantity(4);

        setWood(woodenStick);
        setWood(woodenTree);

    }

    private static void setWood(Wood w) {
        w.out();
    }

}