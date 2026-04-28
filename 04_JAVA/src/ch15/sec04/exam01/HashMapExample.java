package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("tom", 85);
        map.put("jennie", 90);
        map.put("karina", 80);
        map.put("jennie", 95);

        System.out.println("total Entry count: " + map.size());
        System.out.println();

        String key = "jennie";
        int value = map.get(key);
        System.out.println("key: " + key + ", value: " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println("key: " + k + ", value: " + v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println("key: " + k + ", value: " + v);
        }
        System.out.println();

        map.remove("jennie");

        System.out.println("total Entry count: " + map.size());
        System.out.println();


    }
}
