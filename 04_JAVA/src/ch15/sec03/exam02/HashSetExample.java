package ch15.sec03.exam02;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("tom", 40));
        set.add(new Member("tom", 40));

        System.out.println("total members: " + set.size());
    }
}
