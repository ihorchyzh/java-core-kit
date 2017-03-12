package com.ihorchyzh.app.homework.lesson16;

import java.util.Random;

/**
 * Created by ihorchyzh on 3/12/17.
 */
public class GameNames {

    public void showPersons() {
        System.out.println("Here is the list of famous persons:\n");
        for (EnumPeople enumPeople : EnumPeople.values()) {
            System.out.println(enumPeople.getFullName());
        }
        System.out.println("Try to guess their age.\n");
    }

    public int showRandom() {
        int minIndex = 0;
        int manIndex = EnumPeople.values().length - 1;
        Random random = new Random();
        int randomPersonIndex = random.nextInt(manIndex - minIndex + 1) + minIndex;
        System.out.println("Here is full name of the person: " +
                EnumPeople.values()[randomPersonIndex].getFullName() +
                "\nTry to guess his age. Just type the age and press \"Enter\".");
        return randomPersonIndex;
    }

    public void verifyPerson(int age, int randomPersonIndex) {
        if (EnumPeople.values()[randomPersonIndex].getAge() == age) {
            System.out.println("You are right! " + EnumPeople.values()[randomPersonIndex].getFullName() +
                    " age is " + EnumPeople.values()[randomPersonIndex].getAge() + ".");
        } else {
            System.out.println("You are wrong. Try again.");
        }
    }

//    public void isRightChoice(int age) {
//        for (EnumPeople enumPeople : EnumPeople.values()) {
//            if (enumPeople.getAge() == age) {
//                System.out.println(enumPeople.getFullName());
//                System.out.println(enumPeople.getAge());
//            }
//        }
//    }

//    for (Company cName : Company.values()) {
//
//        System.out.println("Company Value: " +
//
//                cName.getValue()+
//
//                " - Company Name: " +
//
//                cName);
//
//    }
//

}
