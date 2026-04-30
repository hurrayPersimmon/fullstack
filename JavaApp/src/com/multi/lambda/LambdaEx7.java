package com.multi.lambda;

class Computer {
    public int multiply(int x, int y) {
        return x * y; // 두 값을 곱해서 반환
    }
}

@FunctionalInterface
interface Calc{
    int calc(int a, int b);
}


public class LambdaEx7 {
    public static void main(String[] args) {

        Computer com = new Computer();

        Calc calc1 = (a, b) -> com.multiply(a, b);
        Calc calc2 = com::multiply;

        System.out.println(calc1.calc(2, 3));
        System.out.println(calc2.calc(2, 3));
    }

}
