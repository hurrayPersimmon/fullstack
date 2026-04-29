package com.multi.lambda;

public class LambdaEx3  {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {}
        });
        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("Hello World"));
        thread2.start();


    }

}
