package com.multi.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class CollectionEx3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for(String str : list) {
            System.out.println(str);
        }

        System.out.println(list);
        System.out.println(list.get(0).startsWith("a"));

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        list.iterator().forEachRemaining(System.out::println);

        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println();
        for(Integer integer : set) {
            System.out.println(integer);
        }

        System.out.println(set);

        System.out.println("");
        Iterator<Integer> iterator1 = set.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");



    }
}
