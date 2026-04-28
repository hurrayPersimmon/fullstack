package com.multi.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionEx3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.iterator().forEachRemaining(System.out::println);

        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println(set);



    }
}
