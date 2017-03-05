package com.ihorchyzh.runners.homework;

import com.ihorchyzh.app.homework.lesson12.Human;
import com.ihorchyzh.app.homework.lesson12.WhiteCollar;

/**
 * Created by ihorchyzh on 2/26/17.
 */
public class Lesson12RunnerHome {

    public static void main(String[] args) {

        Human human = new Human(26, "Ihor");
        WhiteCollar whiteCollar = new WhiteCollar(30, "Chyzh", "Apple");

        System.out.println(human.getName());
        System.out.println(human.getAge());

        human.setAge(40);

        System.out.println(human.getName());
        System.out.println(human.getAge());

        human.setAge(140);

        System.out.println(human.getName());
        System.out.println(human.getAge());

        System.out.println("-----------------------");

        System.out.println(whiteCollar.getAge());
        System.out.println(whiteCollar.getName());
        System.out.println(whiteCollar.getCompany());

        whiteCollar.setAge(35);
        whiteCollar.setName("Ihor Chyzh");
        whiteCollar.setCompany("Google");

        System.out.println(whiteCollar.getAge());
        System.out.println(whiteCollar.getName());
        System.out.println(whiteCollar.getCompany());

    }

}
