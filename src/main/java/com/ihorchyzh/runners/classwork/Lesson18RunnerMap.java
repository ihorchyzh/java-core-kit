package com.ihorchyzh.runners.classwork;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by ihorchyzh on 3/16/17.
 */
public class Lesson18RunnerMap {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        HashSet hashSet1 = new HashSet();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            hashSet.add(scanner.nextLine());
        }

        for (int i = 0; i < 5; i++) {
            hashSet1.add(scanner.nextLine());
        }

        Map map = new HashMap();
        map.put("Cars", hashSet);
        map.put("Days", hashSet1);

        System.out.println(map.get("Cars"));
        System.out.println(map.get("Days"));

    }

}
