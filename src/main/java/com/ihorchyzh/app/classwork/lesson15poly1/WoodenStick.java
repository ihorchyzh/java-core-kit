package com.ihorchyzh.app.classwork.lesson15poly1;

/**
 * Created by ihorchyzh on 3/6/17.
 */
public class WoodenStick extends Wood {


    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void out() {
        System.out.println("This is wooden stick");
    }

    public void color() {
        System.out.println("Red");
    }


}
