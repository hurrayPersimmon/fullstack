package com.multi.thread;

public class ThreadEx2 extends Thread {
    private int [] m = new int[10];

    public ThreadEx2(String name) {
        super(name);
        for (int i = 0; i < 10; i++) {
            m[i] = i+1;
        }
    }



    @Override
    public void run() {
        System.out.println("run : " + this.getName());
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(this.getName() + " " + m[i]);
            }catch (Exception e) {
                System.out.println("Exception");
            }

        }

    }

    public static void main(String[] args) {
        ThreadEx1 threadEx1 = new ThreadEx1();
        ThreadEx2 thread = new ThreadEx2("Thread");


    }
}
