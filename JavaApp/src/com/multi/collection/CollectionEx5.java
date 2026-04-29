package com.multi.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionEx5 {

    public static void main(String[] args) {
        String[] students = {"winter", "karina", "chuu", "karina", "sehyeong"};
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (int i = 0; i < students.length; i++) {
            if(!set1.add(students[i])) set2.add(students[i]);
        }
        System.out.println(set1);
        System.out.println(set2);

        TreeSet<String> set3 = new TreeSet<>();
        for(int i = 0; i < students.length; i++) set3.add(students[i]);
        System.out.println(set3);

    }

}
