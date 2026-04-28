package com.multi.generic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExample2 {
    public static void printList(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> stringList = Arrays.asList("a", "b", "c");
        printList(intList);
        printList(stringList);

    }

}
