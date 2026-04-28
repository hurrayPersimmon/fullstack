package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        set.iterator().forEachRemaining(System.out::println);
        System.out.println();
        for (String s : set) {
            System.out.println(s);
        }
    }

}
