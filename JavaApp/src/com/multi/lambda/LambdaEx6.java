package com.multi.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx6 {

    public static void main(String[] args) {
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("hello");

        Supplier<String> supplier = () -> "hello";
        String result = supplier.get();
        System.out.println(result);

        Function<Integer, String> function = String::valueOf;
        result = function.apply(10);
        System.out.println(result);

        Predicate<Integer> predicate = x -> x > 10;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(20));


    }



}
