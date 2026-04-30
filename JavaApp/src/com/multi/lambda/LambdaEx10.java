package com.multi.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx10 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "c", "B", "d", "F", "g", "e", "h");
        list.forEach(System.out::println);

        System.out.println("---------------");

        list.sort((a,b) -> a.compareToIgnoreCase(b));
        list.sort(String::compareToIgnoreCase);
        list.forEach(System.out::println);

        System.out.println("---------------");

        List<String> upperList = list.stream()
            .map(String::toUpperCase)
            .toList();

        upperList.forEach(System.out::println);

    }

}
