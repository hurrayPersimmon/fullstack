package com.multi.lambda;

public class LambdaEx5 {

    @FunctionalInterface
    public interface Calc {
        int calc(int a, int b);
    }


    public static void main(String[] args) {

        Calc c = Math::max;
        System.out.println(c.calc(3, 4));
    }

}
