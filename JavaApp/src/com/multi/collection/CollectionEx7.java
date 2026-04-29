package com.multi.collection;

import java.util.HashMap;

public class CollectionEx7 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "a");
        hashMap.put(1, "b");

        System.out.println(hashMap);

        hashMap.keySet().forEach(System.out::println);
        hashMap.entrySet().forEach(System.out::println);
        while (hashMap.entrySet().iterator().hasNext()) {
            System.out.println(hashMap.entrySet().iterator().next());
        }
        hashMap.values().forEach(System.out::println);
    }

}
