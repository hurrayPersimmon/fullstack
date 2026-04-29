package com.multi.lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("job executed");
//            }
//        };
//        runnable.run();

//        new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

        Runnable r = () -> System.out.println("Hello World");
        r.run();
    }
}
