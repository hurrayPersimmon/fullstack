package com.multi.lambda;

public class LambdaEx4 {

    public static void main(String[] args) {
        Calc1 c = (x, y) -> System.out.println(x + y);
        c.calc(5, 7);
    }

}
