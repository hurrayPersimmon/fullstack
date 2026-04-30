package com.multi.lambda;

@FunctionalInterface
interface Compare{
    int compare(String a, String b);
}

public class LambdaEx8 {

    public static void main(String[] args) {
        Compare compare = (a,b) -> a.compareTo(b);
        System.out.println(compare.compare("a","c"));
        compare = String::compareTo;
        System.out.println(compare.compare("b","a"));
    }

}
