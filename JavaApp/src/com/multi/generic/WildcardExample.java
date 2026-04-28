package com.multi.generic;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
    public static void printList(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printList(integerList);
        printList(doubleList);
    }
}
