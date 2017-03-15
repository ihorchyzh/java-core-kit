package com.ihorchyzh.app.classwork.lesson17;

/**
 * Created by ihorchyzh on 3/13/17.
 */
public class ArraySorterGenerics<U extends Number> {

    private U[] array;

    public ArraySorterGenerics(U[] array) {
        this.array = array;
    }

    public <U extends Comparable> U[] sortFromSmallToBig(U[] array) {
        U temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}